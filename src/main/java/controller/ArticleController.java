package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dto.ArticleDTO;
import model.Article;
import model.ArticleCategory;
import model.Role;
import model.User;
import service.ArticleCategoryService;
import service.ArticleService;
import service.UserService;

@RestController
@RequestMapping(value = "api/articles")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;

	@Autowired
	private ArticleCategoryService articleCategoryService;

	@Autowired
	private UserService userService;
	
	// list all articles
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<ArticleDTO>> getArticles() {
		List<ArticleDTO> articles = new ArrayList<ArticleDTO>();
		for( Article a : articleService.findAll()) {
			articles.add(new ArticleDTO(a));
		}
		return new ResponseEntity<>(articles, HttpStatus.OK);
	}
	
	// find article by id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ArticleDTO> getArticle(@PathVariable String id) {
		Article article = articleService.findOne(id);
		if (article == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(new ArticleDTO(article), HttpStatus.OK);
	}
	
	// create article
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ArticleDTO> createArticle(@RequestBody ArticleDTO dto) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User authenticated = userService.findOne(authentication.getName());
		if(authenticated.getRole() != Role.MANAGER) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		ArticleCategory category = articleCategoryService.findOne(dto.getCategory().getId());
		Article article = new Article(
			dto.getId(),
			dto.getName(),
			category,
			dto.getPrice(),
			dto.getQuantity(),
			new Date(),
			dto.isLow_quantity(),
			dto.getMin_quantity(),
			dto.isActive()
		);
		article = articleService.save(article);
		return new ResponseEntity<>(new ArticleDTO(article), HttpStatus.CREATED);
	}
	
	// update article
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ArticleDTO> updateArticle(@PathVariable String id, @RequestBody ArticleDTO dto) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User authenticated = userService.findOne(authentication.getName());
		if(authenticated.getRole() != Role.MANAGER) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		ArticleCategory category = articleCategoryService.findOne(dto.getCategory().getId());
		Article article = articleService.findOne(id);
		if (article == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		article.setName(dto.getName());
		article.setCategory(category);
		article.setPrice(dto.getPrice());
		article.setQuantity(dto.getQuantity());
		article.setMin_quantity(article.getMin_quantity());
		article.setActive(dto.isActive());
		article = articleService.save(article);
		return new ResponseEntity<>(new ArticleDTO(article), HttpStatus.CREATED);
	}
	
	// delete article
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteArticle(@PathVariable String id) {	
		
		Article article = articleService.findOne(id);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		User authenticated = userService.findOne(authentication.getName());
		if(authenticated.getRole() != Role.MANAGER) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		if (article == null) {			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		articleService.remove(article.getId());
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

package controller;

import java.util.ArrayList;
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

import dto.ArticleCategoryDTO;
import model.ArticleCategory;
import model.Role;
import model.User;
import service.ArticleCategoryService;
import service.UserService;

@RestController
@RequestMapping(value = "api/article_categories")
public class ArticleCategoryController {
	
	@Autowired
	private ArticleCategoryService articleCategoryService;
	
	@Autowired
	private UserService userService;
	
	// list all articles
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<ArticleCategoryDTO>> getArticleCategories() {
		List<ArticleCategoryDTO> articles = new ArrayList<ArticleCategoryDTO>();
		for( ArticleCategory a : articleCategoryService.findAll()) {
			articles.add(new ArticleCategoryDTO(a));
		}
		return new ResponseEntity<>(articles, HttpStatus.OK);
	}
	
	// find article by id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ArticleCategoryDTO> getArticleCategory(@PathVariable String id) {
		ArticleCategory article = articleCategoryService.findOne(id);
		if (article == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(new ArticleCategoryDTO(article), HttpStatus.OK);
	}
	
	// create article
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ArticleCategoryDTO> createArticleCategory(@RequestBody ArticleCategoryDTO dto) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User authenticated = userService.findOne(authentication.getName());
		if(authenticated.getRole() != Role.MANAGER) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		ArticleCategory superclass = null;
		if (dto.getSuperclass() != null) {
			superclass = articleCategoryService.findOne(dto.getSuperclass().getId());
		}
		ArticleCategory category = new ArticleCategory(
			dto.getName(),
			dto.getId(),
			superclass,
			dto.getMax_discount()
		);
		
		category = articleCategoryService.save(category);
		return new ResponseEntity<>(new ArticleCategoryDTO(category), HttpStatus.CREATED);
	}
	
	// update article category
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ArticleCategoryDTO> updateArticleCategory(@PathVariable String id, @RequestBody ArticleCategoryDTO dto) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User authenticated = userService.findOne(authentication.getName());
		if(authenticated.getRole() != Role.MANAGER) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		ArticleCategory superclass = null;
		if (dto.getSuperclass() != null) {
			superclass = articleCategoryService.findOne(dto.getSuperclass().getId());
		}
		ArticleCategory category = articleCategoryService.findOne(id);
		if (category == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		category.setMax_discount(dto.getMax_discount());
		category.setSuperclass(superclass);
		
		category = articleCategoryService.save(category);
		return new ResponseEntity<>(new ArticleCategoryDTO(category), HttpStatus.CREATED);
	}
	
	// delete article
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteArticle(@PathVariable String id) {	
		
		ArticleCategory category = articleCategoryService.findOne(id);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		User authenticated = userService.findOne(authentication.getName());
		if(authenticated.getRole() != Role.MANAGER) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		if (category == null) {			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		articleCategoryService.remove(category.getId());
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

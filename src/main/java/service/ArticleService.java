package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.ArticleDTO;
import model.Article;
import repository.ArticleRepository;

@Service
public class ArticleService {
	@Autowired
	ArticleRepository articleRepository;

	public Article findOne(String id) {
		return articleRepository.findOne(id);
	}

	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	public Article save(Article article) {
		return articleRepository.save(article);
	}

	public void remove(String id) {
		articleRepository.delete(id);
	}

	public Article getEntity(ArticleDTO e) {
		return findOne(e.getId());
	}
}

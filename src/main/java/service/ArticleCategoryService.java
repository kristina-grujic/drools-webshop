package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.ArticleCategoryDTO;
import model.ArticleCategory;
import repository.ArticleCategoryRepository;

@Service
public class ArticleCategoryService {
	@Autowired
	ArticleCategoryRepository articleCategoryRepository;

	public ArticleCategory findOne(String id) {
		return articleCategoryRepository.findOne(id);
	}

	public List<ArticleCategory> findAll() {
		return articleCategoryRepository.findAll();
	}

	public ArticleCategory save(ArticleCategory article) {
		return articleCategoryRepository.save(article);
	}

	public void remove(String id) {
		articleCategoryRepository.delete(id);
	}

	public ArticleCategory getEntity(ArticleCategoryDTO e) {
		return findOne(e.getId());
	}
}

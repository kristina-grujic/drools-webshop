package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.ArticleCategory;

public interface ArticleCategoryRepository extends JpaRepository<ArticleCategory, String> {
	public ArticleCategory findById(String id);
}

package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Article;

public interface ArticleRepository extends JpaRepository<Article, String> {
	public Article findById(String id);
}

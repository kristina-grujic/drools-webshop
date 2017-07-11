package dto;

import model.ArticleCategory;

public class ArticleCategoryDTO {

	public String name;
	public String id;
	public ArticleCategory superclass;
	public int max_discount;
	
	public ArticleCategoryDTO(ArticleCategory category) {
		super();
		this.name = category.getName();
		this.id = category.getId();
		this.superclass = category.getSuperclass();
		this.max_discount = category.getMax_discount();
	}	
	
	public ArticleCategoryDTO(String name, String id, ArticleCategory superclass, int max_discount) {
		super();
		this.name = name;
		this.id = id;
		this.superclass = superclass;
		this.max_discount = max_discount;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArticleCategory getSuperclass() {
		return superclass;
	}
	public void setSuperclass(ArticleCategory superclass) {
		this.superclass = superclass;
	}
	public int getMax_discount() {
		return max_discount;
	}
	public void setMax_discount(int max_discount) {
		this.max_discount = max_discount;
	}

}

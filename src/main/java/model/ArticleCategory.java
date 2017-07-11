package model;

public class ArticleCategory {
	public String name;
	public String id;
	public ArticleCategory superclass;
	public int max_discount;
	
	public ArticleCategory(String name, String id, ArticleCategory superclass, int max_discount) {
		super();
		this.name = name;
		this.id = id;
		this.superclass = superclass;
		if (max_discount>=100) {
			this.max_discount = 100;
		} else if (max_discount<= 0) {
			this.max_discount = 0;
		} else {
			this.max_discount = max_discount;
		}
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
		if (max_discount>=100) {
			this.max_discount = 100;
		} else if (max_discount<= 0) {
			this.max_discount = 0;
		} else {
			this.max_discount = max_discount;
		}
	}

	@Override
	public String toString() {
		return "ArticleCategory [name=" + name + ", id=" + id + ", superclass=" + superclass + ", max_discount="
				+ max_discount + "]";
	}
		
}

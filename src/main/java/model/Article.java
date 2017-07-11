package model;

import java.util.Date;

public class Article {
	public String id;
	public String name;
	public ArticleCategory category;
	public double price;
	public int quantity;
	public Date created_at;
	public boolean low_quantity;
	public int min_quantity;
	public boolean active;
	
	
	
	
	public Article(String id, String name, ArticleCategory category, double price, int quantity, Date created_at,
			boolean low_quantity, int min_quantity, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.created_at = created_at;
		this.low_quantity = low_quantity;
		this.min_quantity = min_quantity;
		this.active = active;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArticleCategory getCategory() {
		return category;
	}
	public void setCategory(ArticleCategory category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public boolean isLow_quantity() {
		return low_quantity;
	}
	public void setLow_quantity(boolean low_quantity) {
		this.low_quantity = low_quantity;
	}
	public int getMin_quantity() {
		return min_quantity;
	}
	public void setMin_quantity(int min_quantity) {
		this.min_quantity = min_quantity;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", quantity="
				+ quantity + ", created_at=" + created_at + ", low_quantity=" + low_quantity + ", min_quantity="
				+ min_quantity + ", active=" + active + "]";
	}
	
}

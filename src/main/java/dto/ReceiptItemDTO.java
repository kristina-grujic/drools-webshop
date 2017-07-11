package dto;

import java.util.ArrayList;

import model.Discount;
import model.ReceiptItem;

public class ReceiptItemDTO {

	public int item_ordinal;
	public ArticleDTO article;
	public int quantity;
	public double article_price;
	public double original_price;
	public double final_price;
	public int total_discount;
	public ArrayList<DiscountDTO> discounts;
	
	public ReceiptItemDTO(ReceiptItem item) {
		super();
		this.item_ordinal = item.getItem_ordinal();
		this.article = new ArticleDTO(item.getArticle());
		this.quantity = item.getQuantity();
		this.article_price = item.getArticle_price();
		this.original_price = item.getOriginal_price();
		this.final_price = item.getFinal_price();
		this.total_discount = item.getTotal_discount();
		this.discounts = new ArrayList<DiscountDTO>();
		for (Discount d: item.getDiscounts()) {
			this.discounts.add(new DiscountDTO(d));
		}
	}
	
	
	public ReceiptItemDTO(int item_ordinal, ArticleDTO article, int quantity, double article_price,
			double original_price, double final_price, int total_discount, ArrayList<DiscountDTO> discounts) {
		super();
		this.item_ordinal = item_ordinal;
		this.article = article;
		this.quantity = quantity;
		this.article_price = article_price;
		this.original_price = original_price;
		this.final_price = final_price;
		this.total_discount = total_discount;
		this.discounts = discounts;
	}
	
	
	public int getItem_ordinal() {
		return item_ordinal;
	}
	public void setItem_ordinal(int item_ordinal) {
		this.item_ordinal = item_ordinal;
	}
	public ArticleDTO getArticle() {
		return article;
	}
	public void setArticle(ArticleDTO article) {
		this.article = article;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getArticle_price() {
		return article_price;
	}
	public void setArticle_price(double article_price) {
		this.article_price = article_price;
	}
	public double getOriginal_price() {
		return original_price;
	}
	public void setOriginal_price(double original_price) {
		this.original_price = original_price;
	}
	public double getFinal_price() {
		return final_price;
	}
	public void setFinal_price(double final_price) {
		this.final_price = final_price;
	}
	public int getTotal_discount() {
		return total_discount;
	}
	public void setTotal_discount(int total_discount) {
		this.total_discount = total_discount;
	}
	public ArrayList<DiscountDTO> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(ArrayList<DiscountDTO> discounts) {
		this.discounts = discounts;
	}
	
	
}

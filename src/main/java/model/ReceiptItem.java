package model;

import java.util.ArrayList;

public class ReceiptItem {
	public int item_ordinal;
	public Receipt receipt;
	public Article article;
	public int quantity;
	public double article_price;
	public double original_price;
	public double final_price;
	public int total_discount;
	public ArrayList<Discount> discounts;
	
	public ReceiptItem(int item_ordinal, Receipt receipt, Article article, int quantity, double article_price,
			double original_price, double final_price, int total_discount, ArrayList<Discount> discounts) {
		super();
		this.item_ordinal = item_ordinal;
		this.receipt = receipt;
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
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
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
	public ArrayList<Discount> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(ArrayList<Discount> discounts) {
		this.discounts = discounts;
	}
	@Override
	public String toString() {
		return "ReceiptItem [item_ordinal=" + item_ordinal + ", receipt=" + receipt + ", article=" + article
				+ ", quantity=" + quantity + ", article_price=" + article_price + ", original_price=" + original_price
				+ ", final_price=" + final_price + ", total_discount=" + total_discount + "]";
	}
	
}

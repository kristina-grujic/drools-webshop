package model;

import java.util.ArrayList;
import java.util.Date;

public class Receipt {
	public String id;
	public Customer customer;
	public Date created_at;
	public ReceiptState state;
	public int total_discount;
	public double original_price;
	public double final_price;
	public int used_points;
	public int achieved_points;
	public ArrayList<Discount> discounts;
	public ArrayList<ReceiptItem> items;
	
	
	public Receipt(String id, Customer customer, Date created_at, ReceiptState state, int total_discount,
			double original_price, double final_price, int used_points, int achieved_points,
			ArrayList<Discount> discounts, ArrayList<ReceiptItem> items) {
		super();
		this.id = id;
		this.customer = customer;
		this.created_at = created_at;
		this.state = state;
		this.total_discount = total_discount;
		this.original_price = original_price;
		this.final_price = final_price;
		this.used_points = used_points;
		this.achieved_points = achieved_points;
		this.discounts = discounts;
		this.items = items;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public ReceiptState getState() {
		return state;
	}
	public void setState(ReceiptState state) {
		this.state = state;
	}
	public int getTotal_discount() {
		return total_discount;
	}
	public void setTotal_discount(int total_discount) {
		this.total_discount = total_discount;
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
	public int getUsed_points() {
		return used_points;
	}
	public void setUsed_points(int used_points) {
		this.used_points = used_points;
	}
	public int getAchieved_points() {
		return achieved_points;
	}
	public void setAchieved_points(int achieved_points) {
		this.achieved_points = achieved_points;
	}
	public ArrayList<Discount> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(ArrayList<Discount> discounts) {
		this.discounts = discounts;
	}
	public ArrayList<ReceiptItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<ReceiptItem> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Receipt [id=" + id + ", customer=" + customer + ", created_at=" + created_at + ", total_discount="
				+ total_discount + ", original_price=" + original_price + ", final_price=" + final_price
				+ ", used_points=" + used_points + ", achieved_points=" + achieved_points + ", discounts=" + discounts
				+ "]";
	}
	
	
}

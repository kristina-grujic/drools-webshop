package dto;

import java.util.ArrayList;
import java.util.Date;

import model.Customer;
import model.Discount;
import model.Receipt;
import model.ReceiptItem;
import model.ReceiptState;

public class ReceiptDTO {
	public String id;
	public CustomerDTO customer;
	public Date created_at;
	public ReceiptState state;
	public int total_discount;
	public double original_price;
	public double final_price;
	public int used_points;
	public int achieved_points;
	public ArrayList<DiscountDTO> discounts;
	public ArrayList<ReceiptItemDTO> items;
	
	
	public ReceiptDTO(Receipt receipt) {
		super();
		this.id = receipt.getId();
		this.customer = new CustomerDTO(receipt.getCustomer());
		this.created_at = receipt.getCreated_at();
		this.state = receipt.getState();
		this.total_discount = receipt.getTotal_discount();
		this.original_price = receipt.getOriginal_price();
		this.final_price = receipt.getFinal_price();
		this.used_points = receipt.getUsed_points();
		this.achieved_points = receipt.getAchieved_points();
		this.discounts = new ArrayList<DiscountDTO>();
		this.items = new ArrayList<ReceiptItemDTO>();
		for (Discount d : receipt.getDiscounts()) {
			this.discounts.add(new DiscountDTO(d));
		}
		for (ReceiptItem d : receipt.getItems()) {
			this.items.add(new ReceiptItemDTO(d));
		}
	}
	
	
	public ReceiptDTO(String id, CustomerDTO customer, Date created_at, ReceiptState state, int total_discount,
			double original_price, double final_price, int used_points, int achieved_points,
			ArrayList<DiscountDTO> discounts, ArrayList<ReceiptItemDTO> items) {
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
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
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
	public ArrayList<DiscountDTO> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(ArrayList<DiscountDTO> discounts) {
		this.discounts = discounts;
	}
	public ArrayList<ReceiptItemDTO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ReceiptItemDTO> items) {
		this.items = items;
	}
	
	
}

package model;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends User {
	public String address;
	public CustomerCategory category;
	public int reward_points;
	public ArrayList<Receipt> receipts;
	
	public Customer() {
		super();
		this.reward_points = 0;
		this.receipts = new ArrayList<Receipt>();
	}
	
	public Customer(String username, String password, Role role, String first_name, String last_name, Date created_at,
			String address, CustomerCategory category, int reward_points, ArrayList<Receipt> receipts) {
		super(username, password, role, first_name, last_name, created_at);
		this.address = address;
		this.category = category;
		this.reward_points = reward_points;
		this.receipts = receipts;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerCategory getCategory() {
		return category;
	}
	public void setCategory(CustomerCategory category) {
		this.category = category;
	}
	public int getReward_points() {
		return reward_points;
	}
	public void setReward_points(int reward_points) {
		this.reward_points = reward_points;
	}
	public ArrayList<Receipt> getReceipts() {
		return receipts;
	}
	public void setReceipts(ArrayList<Receipt> receipts) {
		this.receipts = receipts;
	}
	
	@Override
	public String toString() {
		return "Customer [category=" + category + ", reward_points=" + reward_points + ", receipts=" + receipts
				+ ", username=" + username + ", password=" + password + ", role=" + role + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", created_at=" + created_at + "]";
	}
	
	
}

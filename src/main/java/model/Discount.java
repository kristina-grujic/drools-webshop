package model;

public abstract class Discount {
	public String id;
	public int discount;
	public boolean is_additional;
	
	public Discount(String id, int discount, boolean is_additional) {
		super();
		this.id = id;
		this.discount = discount;
		this.is_additional = is_additional;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public boolean isIs_additional() {
		return is_additional;
	}
	public void setIs_additional(boolean is_additional) {
		this.is_additional = is_additional;
	}
	
	
}

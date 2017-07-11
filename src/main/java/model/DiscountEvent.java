package model;

import java.util.ArrayList;
import java.util.Date;

public class DiscountEvent {
	public String id;
	public String name;
	public Date start_date;
	public Date end_date;
	public int discount;
	public ArrayList<ArticleCategory> applied_categories;
	
	public DiscountEvent(String id, String name, Date start_date, Date end_date, int discount,
			ArrayList<ArticleCategory> applied_categories) {
		super();
		this.id = id;
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
		if (discount>=100) {
			this.discount = 100;
		} else if (discount<= 0) {
			this.discount = 0;
		} else {
			this.discount = discount;
		}
		this.applied_categories = new ArrayList<ArticleCategory>();
		if (applied_categories!=null) {
			this.applied_categories = applied_categories;
		}
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
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		if (discount>=100) {
			this.discount = 100;
		} else if (discount<= 0) {
			this.discount = 0;
		} else {
			this.discount = discount;
		}
	}
	public ArrayList<ArticleCategory> getApplied_categories() {
		return applied_categories;
	}
	public void setApplied_categories(ArrayList<ArticleCategory> applied_categories) {
		this.applied_categories = applied_categories;
	}
	@Override
	public String toString() {
		return "DiscountEvent [id=" + id + ", name=" + name + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", discount=" + discount + ", applied_categories=" + applied_categories + "]";
	}

}

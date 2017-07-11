package dto;

import java.util.ArrayList;
import java.util.Date;

import model.ArticleCategory;
import model.DiscountEvent;

public class DiscountEventDTO {
	public String id;
	public String name;
	public Date start_date;
	public Date end_date;
	public int discount;
	public ArrayList<ArticleCategoryDTO> applied_categories;
	
	public DiscountEventDTO(DiscountEvent de) {
		super();
		this.id = de.getId();
		this.name = de.getName();
		this.start_date = de.getStart_date();
		this.end_date = de.getEnd_date();
		this.discount = de.getDiscount();
		this.applied_categories = new ArrayList<ArticleCategoryDTO>();
		for(ArticleCategory cat : de.getApplied_categories()) {
			this.applied_categories.add(new ArticleCategoryDTO(cat));
		}
	}
	
	public DiscountEventDTO(String id, String name, Date start_date, Date end_date, int discount,
			ArrayList<ArticleCategoryDTO> applied_categories) {
		super();
		this.id = id;
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.discount = discount;
		this.applied_categories = applied_categories;
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
		this.discount = discount;
	}
	public ArrayList<ArticleCategoryDTO> getApplied_categories() {
		return applied_categories;
	}
	public void setApplied_categories(ArrayList<ArticleCategoryDTO> applied_categories) {
		this.applied_categories = applied_categories;
	}
	
}

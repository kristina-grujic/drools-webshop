package dto;

import java.util.ArrayList;

import model.ConsumptionThreshold;
import model.CustomerCategory;

public class CustomerCategoryDTO {
	public String id;
	public String name;
	public ArrayList<ConsumptionThresholdDTO> threshold;
	
	public CustomerCategoryDTO(CustomerCategory category) {
		super();
		this.id = category.getId();
		this.name = category.getName();
		this.threshold = new ArrayList<ConsumptionThresholdDTO>();
		for(ConsumptionThreshold ct : category.getThreshold()) {
			this.threshold.add(new ConsumptionThresholdDTO(ct));
		}
	}
	
	public CustomerCategoryDTO(String id, String name, ArrayList<ConsumptionThresholdDTO> threshold) {
		super();
		this.id = id;
		this.name = name;
		this.threshold = threshold;
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
	public ArrayList<ConsumptionThresholdDTO> getThreshold() {
		return threshold;
	}
	public void setThreshold(ArrayList<ConsumptionThresholdDTO> threshold) {
		this.threshold = threshold;
	}

}

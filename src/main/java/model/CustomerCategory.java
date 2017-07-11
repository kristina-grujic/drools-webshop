package model;

import java.util.ArrayList;

public class CustomerCategory {
	public String id;
	public String name;
	public ArrayList<ConsumptionThreshold> threshold;
	
	public CustomerCategory(String id, String name, ArrayList<ConsumptionThreshold> threshold) {
		super();
		this.id = id;
		this.name = name;
		this.threshold = new ArrayList<ConsumptionThreshold>();
		if (threshold != null) {
			this.threshold = threshold;
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
	public ArrayList<ConsumptionThreshold> getThreshold() {
		return threshold;
	}
	public void setThreshold(ArrayList<ConsumptionThreshold> threshold) {
		this.threshold = threshold;
	}

	@Override
	public String toString() {
		return "CustomerCategory [id=" + id + ", name=" + name + ", threshold=" + threshold.toString() + "]";
	}
	
}

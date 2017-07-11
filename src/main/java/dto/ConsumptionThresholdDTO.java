package dto;

import model.ConsumptionThreshold;

public class ConsumptionThresholdDTO {

	public int down_threshold;
	public int up_threshold;
	public String rule;
	
	public ConsumptionThresholdDTO(ConsumptionThreshold ct) {
		super();
		this.down_threshold = ct.getDown_threshold();
		this.up_threshold = ct.getUp_threshold();
		this.rule = ct.getRule();
	}
	
	public ConsumptionThresholdDTO(int down_threshold, int up_threshold, String rule) {
		super();
		this.down_threshold = down_threshold;
		this.up_threshold = up_threshold;
		this.rule = rule;
	}
	
	public int getDown_threshold() {
		return down_threshold;
	}
	public void setDown_threshold(int down_threshold) {
		this.down_threshold = down_threshold;
	}
	public int getUp_threshold() {
		return up_threshold;
	}
	public void setUp_threshold(int up_threshold) {
		this.up_threshold = up_threshold;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	
	

}

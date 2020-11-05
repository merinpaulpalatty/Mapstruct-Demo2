package com.ust.mapstructDemo.vo;

import java.util.Date;
import java.util.List;



public class DietVO {
	
	private int dietId;
	private String dietInstructor;
	private int weight;
	private int qty;
	private String targetDateInString;
	private Date targetDate;
	private String expressionExp;
	private List<FruitVO> fruits;
	
	//unmapping examples
	private String unmappedVo1;
	
	
	public int getDietId() {
		return dietId;
	}

	public void setDietId(int dietId) {
		this.dietId = dietId;
	}

	

	public String getDietInstructor() {
		return dietInstructor;
	}

	public void setDietInstructor(String dietInstructor) {
		this.dietInstructor = dietInstructor;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	

	public List<FruitVO> getFruits() {
		return fruits;
	}

	public void setFruits(List<FruitVO> fruits) {
		this.fruits = fruits;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getTargetDateInString() {
		return targetDateInString;
	}

	public void setTargetDateInString(String targetDateInString) {
		this.targetDateInString = targetDateInString;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String getExpressionExp() {
		return expressionExp;
	}

	public void setExpressionExp(String expressionExp) {
		this.expressionExp = expressionExp;
	}

	public String getUnmappedVo1() {
		return unmappedVo1;
	}

	public void setUnmappedVo1(String unmappedVo1) {
		this.unmappedVo1 = unmappedVo1;
	}


}

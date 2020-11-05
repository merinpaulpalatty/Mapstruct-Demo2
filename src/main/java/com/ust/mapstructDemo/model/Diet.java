package com.ust.mapstructDemo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Diet {

	@Id
	@GeneratedValue
	private int dietId;
	private String dietInstructor;
	private int weight;
	private Date targetDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Fruit> fruits;
	
	//unmapped examples
	private String unmappedEx1;


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

	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String getUnmappedEx1() {
		return unmappedEx1;
	}

	public void setUnmappedEx1(String unmappedEx1) {
		this.unmappedEx1 = unmappedEx1;
	}

}

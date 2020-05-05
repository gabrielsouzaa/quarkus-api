package com.gabrielsouzaa.entity;

public class Expense {

    public String description;
    public Double value;

    public Expense(String description, Double value) {
		this.description = description;
		this.value = value;
	}
    
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}

}
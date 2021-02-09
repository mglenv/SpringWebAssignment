package com.example.demo;

public class CreditCard {

	private String brand;
	private int number;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public CreditCard(String brand, int number) {
		super();
		this.brand = brand;
		this.number = number;
	}
	
	
	
	
}

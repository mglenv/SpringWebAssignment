package com.example.demo;

public class ZipcodeData {

	private String zipcode;
	private String state;
	private String city;
	private String country;
	
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCity() {
		return city;
	} 
	public void setCity(String city) {
		this.city = city;
	}

	public ZipcodeData(String zipcode, String state, String city, String country) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	
	public ZipcodeData(String zipcode) {
		super();
		this.zipcode = zipcode;
	}
	
	
}

package com.example.demo;

public class Order {

	private String id;
	private int quantity;
	private int price;
	private String name;
	private String item;
	
	public Order(String id, int quantity, int price, String name, String item) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.name = name;
		this.item = item;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
}

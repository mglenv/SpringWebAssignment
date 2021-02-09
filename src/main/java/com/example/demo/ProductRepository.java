package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	
	private ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(
			new Product(010, "Hat", 4.99f),
			new Product(014, "Shirt", 11.99f),
			new Product(012, "Coat", 14.99f)
			));

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public Product updateProduct(int id, Product newProduct) {
		for(Product p: products) {
			if(p.getId() == id) {
				p.setId(newProduct.getId());
				p.setCost(newProduct.getCost());
				p.setName(newProduct.getName());
	
				return newProduct;
			}
		}return null;
		
	}
	public Product getProduct(int id) {
		for(Product p : products) {
			if(p.getId() == id);
		}
		return null;
	}
	
	public Product addProduct(Product newProduct) {
		products.add(newProduct);
		return newProduct;
		
	}
	
	public void deleteProduct(int id) {
		products.removeIf(p -> p.getId() == id);	
	}
	

}

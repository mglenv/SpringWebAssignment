package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductAssingment {

	@Autowired
	private ProductRepository productRepo;
	
	//GET all 
	@RequestMapping("/orders")
	public List<Product> getAllProducts() {
		return productRepo.getProducts();
	}
	
	//GET individual Product
	@RequestMapping("/Products/{id}")
	public Product getProduct(@PathVariable int id) {
		return productRepo.getProduct(id);
	}
	
	//POST Product
	//RequestMapping default is a GET request
	@RequestMapping(method=RequestMethod.POST, value="/Products")
	public void addProduct(@RequestBody Product Product) {
		productRepo.addProduct(Product);		
	}
	
	//PUT Product
	@PutMapping(value="/Products/{id}")
	public void updateProduct(@RequestBody Product Product, @PathVariable int id) {
		productRepo.updateProduct(id, Product);		
	}
	
	//DELETE Product
	@DeleteMapping(value="/Products/{id}")
	public void deleteProduct(@PathVariable int id) {
		productRepo.deleteProduct(id);		
	}
	
}

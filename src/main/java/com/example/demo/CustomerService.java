package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerRepository custRepo;
	
	
	public List<Customer> getCustomers(){
		List<Customer> customers = new ArrayList<>();
		custRepo.findAll()
		.forEach(customers::add);
		return customers;
	}
	
	public Customer getCustomer(String id) {
		return custRepo.findById(id).orElse(null);
	}
	
	public void addCustomer(Customer customer) {
		custRepo.save(customer);
	}
	
	public void updateCustomer(String id, Customer customer) {
		custRepo.save(customer);
		
	}
	public void deleteCustomer(String id) {
		custRepo.deleteById(id);
	}
	
}

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
public class CustomerAssignment {
	
	@Autowired
	private CustomerService customerService;
	
	//GET all customers
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getCustomers();
	}
	
	//GET individual customer
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}
	
	//POST customer
	//RequestMapping default is a GET request
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);		
	}
	
	//PUT customer
	@PutMapping(value="/customers/{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable String id) {
		customerService.updateCustomer(id, customer);		
	}
	
	//DELETE customer
	@DeleteMapping(value="/customers/{id}")
	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);		
	}

}

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
public class OrderAssignment {

	@Autowired
	private OrderRepository orderRepo;
	
	//GET all 
	@RequestMapping("/orders")
	public List<Order> getAllOrders() {
		return orderRepo.getOrders();
	}
	
	//GET individual Order
	@RequestMapping("/orders/{id}")
	public Order getOrder(@PathVariable String id) {
		return orderRepo.getOrder(id);
	}
	
	//POST Order
	//RequestMapping default is a GET request
	@RequestMapping(method=RequestMethod.POST, value="/orders")
	public void addOrder(@RequestBody Order Order) {
		orderRepo.addOrder(Order);		
	}
	
	//PUT Order
	@PutMapping(value="/orders/{id}")
	public void updateOrder(@RequestBody Order Order, @PathVariable String id) {
		orderRepo.updateOrder(id, Order);		
	}
	
	//DELETE Order
	@DeleteMapping(value="/orders/{id}")
	public void deleteOrder(@PathVariable String id) {
		orderRepo.deleteOrder(id);		
	}
	
}

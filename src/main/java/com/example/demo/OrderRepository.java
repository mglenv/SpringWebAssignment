package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Repository;


@Repository
public class OrderRepository {

	private ArrayList<Order> orders = new ArrayList<Order>(Arrays.asList(
			new Order("012", 1, 20, "Matt", "blender"),
			new Order("011", 2, 13, "Jim", "knife"),
			new Order("013", 30, 2, "Ken", "straw")
			));

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	public Order updateOrder(String id, Order newOrder) {
		for(Order o: orders) {
			if(o.getId().equals(id)) {
				o.setId(newOrder.getId());
				o.setItem(newOrder.getItem());
				o.setName(newOrder.getName());
				o.setPrice(newOrder.getPrice());
				o.setQuantity(newOrder.getQuantity());
				return newOrder;
			}
		}return null;
		
	}
	public Order getOrder(String id) {
		for(Order o : orders) {
			if(o.getId().equals(id));
		}
		return null;
	}
	
	public Order addOrder(Order newOrder) {
		orders.add(newOrder);
		return newOrder;
		
	}
	
	public void deleteOrder(String id) {
		orders.removeIf(o -> o.getId().equals(id));	
	}
	
	
}

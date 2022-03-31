package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface OrderDAO {
	public void addOrder(Order order);
	public Order findOrder(int id);
	public List<Order> findAllOrder();
	public boolean updateOrder(Order order);
	public boolean deleteOrder(int id);

}

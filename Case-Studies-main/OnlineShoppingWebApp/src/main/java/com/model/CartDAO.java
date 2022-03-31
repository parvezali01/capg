package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface CartDAO {
	public void addCart(Cart cart);
	public Cart findCart(int id);
	public List<Cart> getAllCart();
	public boolean updateCart(Cart cart);
	public boolean deleteCart(int id);

}

package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
	
	@Autowired
	CartDAO cartDAOImpl;
	
	public void addCart(Cart cart) {
		cartDAOImpl.addCart(cart);
	}
	
	public Cart findCart(int id) {
		return cartDAOImpl.findCart(id);
	}
	
	public List<Cart> getAllCarts(){
		return cartDAOImpl.getAllCart();
	}
	
	public boolean updateCart(Cart cart) {
		return cartDAOImpl.updateCart(cart);
	}
	
	public boolean deleteCart(int id) {
		return cartDAOImpl.deleteCart(id);
	}

}

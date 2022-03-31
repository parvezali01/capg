package com.model;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="OrderTable")
public class Order {
	
	@Id
	private int orderId;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Cart> cartList;
	public Order() {
		
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
	
}

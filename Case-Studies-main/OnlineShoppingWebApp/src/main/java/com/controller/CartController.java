package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cart;
import com.model.CartService;
import com.model.Product;
import com.model.User;
import com.model.UserServices;

@RestController
public class CartController{
	@Autowired
	CartService service;
	
	@Autowired
	UserServices userservice;
	@PostMapping("/addcart/{email}")
	public String addtocart(@RequestBody List<Product> productlist,@PathVariable("email") String email) {
		Cart cart=new Cart();
		cart.setProductList(productlist);
		float sum=0;
		for(Product p:productlist) {
			sum+=p.getPrice();
		}
		
		cart.setCartAmt(sum);
		cart.setStatus(true);
		
		User user=userservice.findUser(email);
		
		if(user!=null) {
			cart.setCustomer(user);
			service.addCart(cart);
			return "Cart Confirmed";

		}
			return "Cart Not Confirmed";
		
	
	}

}

package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.model.UserServices;

@RestController
public class UserController {
	@Autowired
	UserServices service;
	
	@PostMapping("/login")
	public String authenticateUser(@RequestBody User user) {
		User to_be_checked=service.findUser(user.getUserEmail());
		if(to_be_checked!=null) {
			if(to_be_checked.getUserPassword().equals(user.getUserPassword())) {
				return "Valid User";
			}
			else {
				return "Invalid User";
			}
		}
		else {
			return "Invalid User";
		}
	}
	
	@PostMapping
	public String registerUser(@RequestBody User user) {
		service.registerUser(user);
		return "User added successfully";
		
	}
}

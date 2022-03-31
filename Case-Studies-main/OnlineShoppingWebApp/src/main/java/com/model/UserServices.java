package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
	
	@Autowired
	UserDAO userDAOImpl;
	
	public List<User> getAllUsers(){
		return userDAOImpl.getAllUsers();
	}
	
	public void registerUser(User user) {
		userDAOImpl.registerUser(user);
	}
	
	public User findUser(String email) {
		return userDAOImpl.findUser(email);
	}
	
	public boolean deleteUser(String email) {
		return userDAOImpl.deleteUser(email);
	}
	
	public boolean updateUser(User user) {
		return userDAOImpl.updateUser(user);
	}

}

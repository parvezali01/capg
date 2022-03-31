package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserDAO {
	List<User> getAllUsers();
	void registerUser(User user);
	boolean deleteUser(String email);
	User findUser(String email);
	boolean updateUser(User user);

}

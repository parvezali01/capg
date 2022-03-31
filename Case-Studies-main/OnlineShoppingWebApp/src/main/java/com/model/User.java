package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
	@Column(name="user_name")
	private String userName;	
	@Id
	private String userEmail;	
	private String userPassword;
	private String userSAddress;
	private String userBAddress;
	public User() {
		
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserSAddress() {
		return userSAddress;
	}
	public void setUserSAddress(String userSAddress) {
		this.userSAddress = userSAddress;
	}
	public String getUserBAddress() {
		return userBAddress;
	}
	public void setUserBAddress(String userBAddress) {
		this.userBAddress = userBAddress;
	}
	
	

}

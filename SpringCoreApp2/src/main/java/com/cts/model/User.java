package com.cts.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class User {
	
	private int userId;
	private String userName;
	private float userSalary;
	
	@PostConstruct
	public void init() {  
		System.out.println("User init Called");
		userId=12121;
		userName="G Kumar";
		userSalary=121312;
	}
	
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public float getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(float userSalary) {
		this.userSalary = userSalary;
	}
	
	
}

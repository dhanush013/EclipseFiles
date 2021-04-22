package com.cts.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("singleton")
public class Appconfig {
	
	@Bean
	public User getUserBean() {
		User user=new User(); 
		
		user.setUserId(10001);
		user.setUserName("A Kumar");
		user.setUserSalary(3210123);
		
		return user;
	}
	
	

}

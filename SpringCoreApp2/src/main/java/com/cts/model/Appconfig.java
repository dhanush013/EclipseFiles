package com.cts.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration

public class Appconfig {
	
	@Bean
	@Scope("prototype") //-- to get different values.
	//@Scope("singleton")  // to get the same values.
	@Lazy
	public User getUserBean() {
		User user=new User(); 
		
		user.setUserId(10001);
		user.setUserName("A Kumar");
		user.setUserSalary(3210123);
		
		return user;
	}
	
	@Bean
	@Scope("singleton")
	@Lazy
	public Student getStudentBean() {
		Student student= new Student();
		
		System.out.println("Appconfig bean is called");
		student.setStudentId(13);
		student.setStudentName("Ram");
		student.setStudentMarks(100);
		
		return student;
	}
	

}

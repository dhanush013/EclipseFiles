package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.User;

public class UserMain {
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("context1.xml");
		
		User user= (User)beanFactory.getBean("user1",User.class);
		
		System.out.println(user.getUserId());
		System.out.println(user.getUserLocation());
		System.out.println(user.getUserName());
		System.out.println(user.getPrdList());
		System.out.println(user.getCityList());
		System.out.println(user.getBookList());
		
		for(String s:user.getPrdList())
			System.out.println(s+" , ");
		
		System.out.println("\nJava 8 Stream");
		user.getPrdList().stream().forEach(a->System.out.println(a+" , "));
		
		
	}

}

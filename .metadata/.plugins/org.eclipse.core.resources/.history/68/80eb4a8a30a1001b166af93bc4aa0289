package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Customer;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("application.xml");
		
		Customer cust= (Customer)beanFactory.getBean("cst");
		
		System.out.println(cust.getCutomerId());
		System.out.println(cust.getCutomerName());
		System.out.println(cust.getCutomerSalary());
		
		
	}

}

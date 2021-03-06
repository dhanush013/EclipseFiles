package com.cts;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cts.model.Delivery;

public class DeliveryMain {
	
	public static void main(String[] args) {
		
		//BeanFactory beanFactory=new ClassPathXmlApplicationContext("application.xml");
		
		//ApplicationContext beanFactory=new ClassPathXmlApplicationContext("application.xml");
		
		ApplicationContext beanFactory=new FileSystemXmlApplicationContext("src/main/resources/application.xml");
		
		//above are the three different methods to access the bean values.
		
		Delivery delivery=beanFactory.getBean("delivery1", Delivery.class);
		
		delivery.setDeliveryId(1);
		delivery.setDeliveryName("Burger Delivery");
		delivery.setDeliveryLocation("Chennai Guindy");
		
		System.out.println(delivery.getDeliveryId());
		System.out.println(delivery.getDeliveryName());
		System.out.println(delivery.getDeliveryLocation());
		
		System.out.println();
		
		Delivery delivery1=beanFactory.getBean("delivery1", Delivery.class);
		
		System.out.println(delivery1.getDeliveryId());
		System.out.println(delivery1.getDeliveryName());
		System.out.println(delivery1.getDeliveryLocation());
		
		System.out.println();
		
		Delivery delivery2=beanFactory.getBean("delivery2", Delivery.class);
		
		System.out.println(delivery2.getDeliveryId());
		System.out.println(delivery2.getDeliveryName());
		System.out.println(delivery2.getDeliveryLocation());
		
		System.out.println();
		
		
		
		
		
	}

}

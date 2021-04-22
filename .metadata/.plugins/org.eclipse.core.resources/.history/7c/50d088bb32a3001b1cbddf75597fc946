package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Kids;

public class KidsMain {
	
	public static void main(String[] args) {
		
		ApplicationContext beanFactory= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Kids k = beanFactory.getBean("kid",Kids.class);
		System.out.println(k.getKidsId());
		System.out.println(k.getKidsName());
		System.out.println(k.getKidsAge());
	}

}

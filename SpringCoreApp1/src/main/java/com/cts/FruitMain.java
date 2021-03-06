package com.cts;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Fruits;

public class FruitMain {
	
public static void main(String[] args) {
		
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Fruits fruits= (Fruits)beanFactory.getBean("fruit",Fruits.class);
		
		System.out.println(fruits.getFruitsId());
		System.out.println(fruits.getFruitsName());
		System.out.println(fruits.getFruitsLocation());
		System.out.println(fruits.getFruitsCost());
		
		System.out.println("-----------------------------------");
		
		fruits= (Fruits)beanFactory.getBean("fruit1",Fruits.class);
		
		//beanFactory.getMessage("fruit.id", null, Locale.US);
		
		System.out.println(beanFactory.getMessage("fruit.id", null, Locale.US)+" "+fruits.getFruitsId());
		System.out.println(beanFactory.getMessage("fruit.name", null, Locale.US)+" "+fruits.getFruitsName());
		System.out.println(beanFactory.getMessage("fruit.location", null, Locale.US)+" "+fruits.getFruitsLocation());
		System.out.println(beanFactory.getMessage("fruit.cost", null, Locale.US)+" "+fruits.getFruitsCost());
		
		System.out.println("-----------------------------------");
		
		fruits= (Fruits)beanFactory.getBean("fruit1",Fruits.class);
		
		//for the language to change we have to create a new messages_"languagename".properties and add the translated file in it.
		//beanFactory.getMessage("fruit.id", null, Locale.US);
		
		System.out.println(beanFactory.getMessage("fruit.id", null, Locale.FRENCH)+" "+fruits.getFruitsId());
		System.out.println(beanFactory.getMessage("fruit.name", null, Locale.FRENCH)+" "+fruits.getFruitsName());
		System.out.println(beanFactory.getMessage("fruit.location", null, Locale.FRENCH)+" "+fruits.getFruitsLocation());
		System.out.println(beanFactory.getMessage("fruit.cost", null, Locale.FRENCH)+" "+fruits.getFruitsCost());
		
		
		
		
	}

}

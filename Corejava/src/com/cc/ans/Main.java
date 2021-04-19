package com.cc.ans;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String name,email;
		int age;
		long number;
		
		System.out.println("Enter The Name");
		name=s.nextLine();
		System.out.println("Enter The Contact Number");
		number=s.nextLong();
		System.out.println("Enter The Email ID");
		//String ss=s.next();
		email=s.next();
		System.out.println("Age");
		age=s.nextInt();
		System.out.println("");
		
		Customer c=new Customer();
		
		c.setCustomerName(name);
		c.setContactNumber(number);
		c.setEmailId(email);
		c.setAge(age);
		
		//String mail=c.getEmailId();
		System.out.println("Name: "+c.getCustomerName());
		System.out.println("ContactNumber: "+c.getContactNumber());
		System.out.println("EmailId: "+c.getEmailId());
		System.out.println("Age: "+c.getAge());
		
		
	}

}

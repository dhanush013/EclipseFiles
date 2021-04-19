package com.cts.model;

public class CustomerFactory {
	
	Customer customer=null;
	
	public Customer createCustomer() {
		if(customer==null) {
			customer=new Customer();
			customer.setCutomerId(7787);
			customer.setCutomerName("A Kumar");
			customer.setCutomerSalary(67000);
		}
		return customer;
	}

}

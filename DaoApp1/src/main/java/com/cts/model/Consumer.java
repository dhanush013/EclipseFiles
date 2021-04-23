package com.cts.model;

import java.util.Date;

//create table in sql.
// sql script - create table  consumer(id int primary key, name varchar(20), salary float (10,2), person_dob date);


public class Consumer {
	
	private int id;
	private String name;
	private float salary;
	private Date dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}

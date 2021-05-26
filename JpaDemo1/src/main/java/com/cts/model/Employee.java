package com.cts.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bankEmployee")
public class Employee {
	
	@Id
	@Column(name = "empId")
	private int id;
	
	@Column(name = "empName", length = 20 ,nullable = false)
	private String name;
	
	@Column(name = "empSalary", nullable = false )
	private float salary;
	
	@Column(name = "empDob", nullable = false )
	private LocalDate dob;

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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}

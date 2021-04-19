package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

class Employee1{
	
	private int empId;
	private String empName;
	private float empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	
}

class EmployeeSortById1 implements Comparator<Employee3>{
	
	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		if(o1.getEmpId() > o2.getEmpId()) {
			return 1;
		}
		else if(o1.getEmpId() < o2.getEmpId()) {
			return -1;
		}
		else
			return 0;
	}
}


public class Sortprg2 {
	
	public static void main(String[] args) {
		
		int id[]= {1000,1001,1002};
		String name[]= {"A kumar","B kumar","C kumar"};
		float salary[]= {20000,12000,15000};
		
		Employee1 employee[]= new Employee1[3];
		for (int i=0; i<employee.length;i++ ) { 
			employee[i]= new Employee1();
			
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);
		}
		
		//Arrays.sort(employee, new EmployeeSortById1());
		System.out.println("Sorted By ID");
		
		
	}

}

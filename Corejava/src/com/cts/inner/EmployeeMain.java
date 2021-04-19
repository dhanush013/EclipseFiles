package com.cts.inner;

import java.util.*;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		int id[]= {1000,1001,1002};
		String name[]= {"A kumar","B kumar","C kumar"};
		float salary[]= {20000,12000,15000};
		
		Employee3 employee[]= new Employee3[3];
		for (int i=0; i<employee.length;i++ ) { 
			employee[i]= new Employee3();
			
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);
		
		}
	}
}
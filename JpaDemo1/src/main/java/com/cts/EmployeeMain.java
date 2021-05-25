package com.cts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cts.model.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hello");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee emp1 = new Employee();
		emp1.setId(10001);
		emp1.setName("Mohan Kumar");
		emp1.setSalary(12000);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(emp1);
		
		transaction.commit();
		
		System.out.println("Records Added");
		
	
	}

}

package com.cts;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cts.model.Employee;


public class EmployeeMain {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hello");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee emp1 = new Employee();
		emp1.setId(10005);
		emp1.setName("E Kumar");
		emp1.setSalary(18000);
		emp1.setDob(LocalDate.of(1995, 12, 25));
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(emp1);

		transaction.commit();
		
		System.out.println("Records Added");
		
		Employee find = entityManager.find(Employee.class, 10000);
		if(find!=null) {
			System.out.println("Record Found");
			System.out.println(find.getId()+" "+find.getName()+" "+find.getSalary());
			
		}else
			System.out.println("Record Not Found");
		
		transaction.begin();
		entityManager.remove(find);
		transaction.commit();
		
		System.out.println("record deleted");
		
		Query createQuery = entityManager.createQuery("from Employee");
		
		List<Employee> resultList = createQuery.getResultList();
		
		for(Employee e:resultList) 
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
		entityManager.close();
		entityManagerFactory.close();
	
	}

}
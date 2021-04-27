package cts.com;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;

import cts.com.dao.CustomerDao;
import cts.com.model.Customer;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		CustomerDao dao = ctx.getBean("dao", CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		// snippet for add values to table
		/*
		System.out.println("Enter The Customer Id Name and Location");
		Customer customer=new Customer();
		customer.setCustomerId(scanner.nextInt());
		scanner.nextLine();
		customer.setCustomerName(scanner.nextLine());
		customer.setCustomerLocation(scanner.next());
		
		try {
		int res = dao.addCustomer(customer);
		System.out.println(res +"  Records Added ");
		}catch( SQLIntegrityConstraintViolationException|DuplicateKeyException e) {
			System.out.println(e.getMessage());
		}
		*/
		// snippet to get all customer values
		/*
		dao.getAllCustomer().forEach(a->System.out.println(a.getCustomerId()+" "+a.getCustomerName()+" "+a.getCustomerLocation()));
		*/
		// snippet for search values in customer using customer id
		
		System.out.println("Enter id to scan");
		Customer customer=null;
		customer=new Customer();
		customer.setCustomerId(scanner.nextInt());
		Customer searchCustomer = dao.searchCustomer(customer);
		if(searchCustomer==null)
			System.out.println("Customer Not Present");
		else {
			System.out.println("Found With Given Values");
			System.out.println(searchCustomer.getCustomerId()+" "+searchCustomer.getCustomerName()+" "+searchCustomer.getCustomerLocation());
			
		}
		
		scanner.close();
		
		
	}

}

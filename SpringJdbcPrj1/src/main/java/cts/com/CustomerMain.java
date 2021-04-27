package cts.com;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cts.com.dao.CustomerDao;
import cts.com.model.Customer;

public class CustomerMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		CustomerDao dao = ctx.getBean("dao", CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Customer Id Name and Location");
		
		Customer customer=new Customer();
		customer.setCustomerId(scanner.nextInt());
		scanner.nextLine();
		customer.setCustomerName(scanner.nextLine());
		customer.setCustomerLocation(scanner.next());
		
		int res = dao.addCustomer(customer);
		System.out.println(res +"  Records Added ");
		scanner.close();
		
	}

}

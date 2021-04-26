package com.cts;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

import com.cts.dao.ConsumerDao;
import com.cts.exception.ConsumerException;
import com.cts.model.Consumer;
import com.cts.util.ApplicationUtil;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class ConsumerMain {
	
	public static void main(String[] args) {
		
		String s="y";
		Scanner scanner=new Scanner(System.in);
		
		ConsumerDao dao;
		try {
			dao = new ConsumerDao();
		
		
			while(s.equals("y")){
			
				System.out.println("1.Add Record");
				System.out.println("2.Remove Record");
				System.out.println("3.Search Record");
				System.out.println("4.Update Record");
				System.out.println("5.Show All Record");
				int op=scanner.nextInt();
				Consumer consumer1=null;
			
				switch (op) {
				
				case 1:
					consumer1=null;
					consumer1=new Consumer();
					System.out.println("Enter Values to Add");
					System.out.println("Enter Id");
					consumer1.setId(scanner.nextInt());
					
					System.out.println("Enter Name");
					scanner.nextLine();
					consumer1.setName(scanner.nextLine());
					
					System.out.println("Enter Salary");
					consumer1.setSalary(scanner.nextFloat());
					
					System.out.println("Enter DOB in dd-MM-yyyy");
					String string=scanner.next();
					
					try {
						consumer1.setDob(ApplicationUtil.checkDateFormat(string));
					} catch (java.text.ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
					Consumer addConsumer= dao.addConsumer(consumer1);
					
					if(addConsumer!=null){
						System.out.println("Record added with values ");
						//Consumer addConsumer = dao.addConsumer(consumer1);
						System.out.println(addConsumer.getId()+" "+addConsumer.getName()+" "+addConsumer.getSalary()+" "+addConsumer.getDob());
						
					} 
					}catch(ConsumerException e) {
						System.err.println(e.getMessage());
					}
					/*
						 * else System.out.println("Record already present");
						 */
					break;
				
				case 2:
					
					consumer1 = null;
					consumer1 = new Consumer();
					System.out.println("Enter id");
					consumer1.setId(scanner.nextInt());
					
					try {
					Consumer deleteConsumer = dao.deleteConsumer(consumer1);
					
					if(deleteConsumer !=null) {
						System.out.println("Record Deleted with values ");
						//Consumer addConsumer = dao.addConsumer(consumer1);
						System.out.println(deleteConsumer.getId()+" "+deleteConsumer.getName()+" "+deleteConsumer.getSalary()+" "+deleteConsumer.getDob());
						
					}
					}catch(ConsumerException e){
						System.err.println(e.getMessage());
					}
					/*else
					 	*	System.out.println("Record not deleted");
					*/
					
					
					break;
					
				
				case 3:
					consumer1 = null;
					consumer1 = new Consumer();
					System.out.println("Enter Id to Search");
					consumer1.setId(scanner.nextInt());
					Consumer consumer2=null;
					try {
					consumer2 =  dao.searchConsumer(consumer1);
					
					/*if(consumer2==null)
						System.out.println("Consumer Not Found");
					*/
					if(consumer2!=null)
					{
						System.out.println("Consumer Found");
						System.out.println(consumer2.getId()+" "+consumer2.getName()+" "+consumer2.getSalary()+" "+consumer2.getDob());
						
					}
					}catch(ConsumerException e) {
						System.err.println(e.getMessage());
						
					}
					break;
					
				case 4:
					consumer1=null;
					consumer1=new Consumer();
					
					System.out.println("Enter the Id in which u want to update");
					consumer1.setId(scanner.nextInt());
					System.out.println("Enter The Updated Values");
					System.out.println("Enter Name");
					scanner.nextLine();
					consumer1.setName(scanner.nextLine());
					
					System.out.println("Enter Salary");
					consumer1.setSalary(scanner.nextFloat());
					
					System.out.println("Enter DOB in dd-MM-yyyy");
					String string1=scanner.next();
					
					try {
						consumer1.setDob(ApplicationUtil.checkDateFormat(string1));
					} catch (java.text.ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
					Consumer updateConsumer= dao.updateConsumer(consumer1);
					
					if(updateConsumer!=null){
						System.out.println("Record updated with values ");
						//Consumer addConsumer = dao.addConsumer(consumer1);
						System.out.println(updateConsumer.getId()+" "+updateConsumer.getName()+" "+updateConsumer.getSalary()+" "+updateConsumer.getDob());
						
					}
					}catch(ConsumerException e){
						System.err.println(e.getMessage());
					}
					/*else
						System.out.println("Record not already present");
					*/
					break;
					
				
				case 5:
					try {
				
					for(Consumer consumer: dao.getAllConsumer())
						System.out.println(consumer.getId()+" "+consumer.getName()+" "+consumer.getSalary()+" "+consumer.getDob());
					}catch(ConsumerException e) {
						System.err.println(e.getMessage());
					}
					break;

				default:
					break;
				}
				System.out.println("Continue y/n");
				s=scanner.next();
			
			}
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}catch(ParseException e) {
			System.out.println("Date not in the Given Format");
		}
		
		
	}

}

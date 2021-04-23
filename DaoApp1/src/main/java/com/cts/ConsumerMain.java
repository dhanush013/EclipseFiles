package com.cts;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

import com.cts.dao.ConsumerDao;
import com.cts.model.Consumer;

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
			
				switch (op) {
				
				case 3:
					Consumer consumer1 = new Consumer();
					System.out.println("Enter Id to Search");
					consumer1.setId(scanner.nextInt());
					Consumer consumer2 =  dao.searchConsumer(consumer1);
					
					if(consumer2==null)
						System.out.println("Consumer Not Found");
					else
					{
						System.out.println("Consumer Found");
						System.out.println(consumer2.getId()+" "+consumer2.getName()+" "+consumer2.getSalary()+" "+consumer2.getDob());
						
					}
					break;
				
				case 5:
				
					for(Consumer consumer: dao.getAllConsumer())
						System.out.println(consumer.getId()+" "+consumer.getName()+" "+consumer.getSalary()+" "+consumer.getDob());
				
					break;

				default:
					break;
				}
				System.out.println("Continue y/n");
				s=scanner.next();
			
			}
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}

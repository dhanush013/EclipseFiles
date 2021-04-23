package com.cts;

import java.sql.SQLException;
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
				System.out.println("1.Remove Record");
				System.out.println("1.Search Record");
				System.out.println("1.Update Record");
				System.out.println("5.Show All Record");
				int op=scanner.nextInt();
			
				switch (op) {
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

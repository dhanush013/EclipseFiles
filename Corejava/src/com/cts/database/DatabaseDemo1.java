package com.cts.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.Scanner;

public class DatabaseDemo1 {
	
	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbaj06", "root","mysql");
		//Statement st=connection.createStatement();
		/*
		if(connection!=null)
			System.out.println("Connection Successfull");
		else
			System.out.println("Some problem");
		
		//Optional<Connection> optional= Optional.ofNullable(null)
			*/
		
		int roll;
		String name,subject;
		float marks;
		
		Scanner sc= new Scanner(System.in);
		
		Statement st=connection.createStatement();
		
		System.out.println("Enter Roll");
		roll=sc.nextInt();
		
		System.out.println("Enter Name");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Subject");
		subject=sc.nextLine();
		System.out.println("Enter Marks");
		marks=sc.nextFloat();
		
		int res =st.executeUpdate("insert into student values("+roll+",'"+name+"','"+subject+"',"+marks+")");
		if(res==1)
			System.out.println("Record Added");
		

		ResultSet rs = st.executeQuery("select * from student");
		
		ResultSetMetaData metaData=rs.getMetaData();
		
		int collNo=metaData.getColumnCount();
		
		for (int i = 1; i <= collNo; i++) {
			System.out.print(metaData.getColumnName(i)+ " ");
		}
		System.out.println();
		
		DatabaseMetaData databaseMetaData;
		
		while(rs.next()) {
		//rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		}
		
	}

}

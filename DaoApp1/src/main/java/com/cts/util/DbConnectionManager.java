package com.cts.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionManager {
	
	private DbConnectionManager() {};
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	static Connection connection;
	
	public static Connection myConnection() throws SQLException {
		
		if(connection == null) {
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbaj06","root","mysql");
			
		}
		return connection;
		
	}
	
	
}

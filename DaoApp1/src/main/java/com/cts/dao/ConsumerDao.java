package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.util.DbConnectionManager;
import com.cts.model.Consumer;

public class ConsumerDao {
	
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private List<Consumer> consumerList;
	private Consumer consumer;
	
	public ConsumerDao() throws SQLException {
		connection= DbConnectionManager.myConnection();
		
	}
	
	public List<Consumer> getAllConsumer() throws SQLException {
		statement=connection.createStatement();
		resultSet= statement.executeQuery("select * from consumer");
		consumerList=new ArrayList<Consumer>();
		
		while(resultSet.next()) {
			consumer=null;
			consumer= new Consumer();
			consumer.setId(resultSet.getInt(1));
			consumer.setName(resultSet.getString(2));
			consumer.setSalary(resultSet.getFloat(3));
			consumer.setDob(resultSet.getDate(4));
			
			
			
		}
		return consumerList
	}
	

}

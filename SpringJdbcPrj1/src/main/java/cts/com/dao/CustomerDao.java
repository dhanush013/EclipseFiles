package cts.com.dao;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import cts.com.model.Customer;

public class CustomerDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addCustomer(Customer customer) throws SQLIntegrityConstraintViolationException {
		return jdbcTemplate.update("insert into customer values(?,?,?)",customer.getCustomerId(),customer.getCustomerName(),customer.getCustomerLocation());
	}
	
	public Customer searchCustomer (Customer customer) {
		
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from customer where customerId=?",customer.getCustomerId());
		
		Map<String, Object> map= queryForList.get(0);
		
		Customer customer1=new Customer();
		customer1.setCustomerId(Integer.parseInt(map.get("customerId").toString()));
		customer1.setCustomerName(map.get("customerName").toString());
		customer1.setCustomerLocation(map.get("customerLocation").toString());
		
		return customer1;
		
		
		
	}
	
	public List<Customer> getAllCustomer(){
		
		List<Map<String, Object>> queryForList=jdbcTemplate.queryForList("select * from customer");
		Customer customer = new Customer();
		List<Customer> list1 = new ArrayList<Customer>();
		
		for(Map<String, Object> map: queryForList) {
			customer.setCustomerId(Integer.parseInt(map.get("customerId").toString()));
			customer.setCustomerName(map.get("customerName").toString());
			customer.setCustomerLocation(map.get("customerLocation").toString());
			list1.add(customer);
		}
		return list1;
		
	}

}

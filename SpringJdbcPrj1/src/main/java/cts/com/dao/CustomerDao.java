package cts.com.dao;

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
	
	public int addCustomer(Customer customer) {
		return jdbcTemplate.update("insert into customer values(?,?,?)",customer.getCustomerId(),customer.getCustomerName(),customer.getCustomerLocation());
	}

}

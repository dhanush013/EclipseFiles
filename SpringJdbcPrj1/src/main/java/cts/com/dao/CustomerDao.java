package cts.com.dao;

import java.sql.SQLIntegrityConstraintViolationException;

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

}

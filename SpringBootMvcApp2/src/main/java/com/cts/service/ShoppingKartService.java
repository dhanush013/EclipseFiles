package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cts.dao.ShoppingKartDao;
import com.cts.error.ProductException;
import com.cts.model.Product;

@Service
public class ShoppingKartService {
	
	@Autowired
	ShoppingKartDao dao;
	
	public Product searchProduct(Product product) {
		if(dao.searchProduct(product)==null)
			throw new ProductException("Product is Not Present");
		else
			return dao.searchProduct(product);
			
	}
	
	public Product addProduct(Product product) {
		
		if(dao.searchProduct(product)!=null)
			throw new ProductException("Product is Already Present");
		else
			return dao.addProduct(product);
		
	}
	
	public List<Product> showAllProduct(){
		if(dao.showAllProduct().size()==0)
			throw new ProductException("Product List is Empty");
		else
			return dao.showAllProduct();
	}
	
	@ExceptionHandler(value = ProductException.class)
	public String productExceptionHandler() {
		return "error";
	}

}

package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.ProductRepository;
import com.cts.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public Product addProduct(Product prd) {
		return productRepository.save(prd);
	}
	
	public Product findProduct(int id) {
		Optional<Product> findById = productRepository.findById(id);
		if(findById.isPresent())
			return findById.get();
		else
			return null;
	}
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}

}

package com.cts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Product;
import com.cts.service.ProductService;

//@Controller
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/all")
	//@ResponseBody
	public List<Product> allProduct(){
		return service.getAllProduct();
	}
	

}

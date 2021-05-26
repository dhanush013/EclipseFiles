package com.cts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Product;
import com.cts.service.ProductService;

//@Controller
// rest controller = controller + response body
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
	
	// get mapping = request mapping + get method
	@GetMapping("search/{id}")
	public  Product searchProduct(@PathVariable("id") int id) {
		
		return service.findProduct(id);
		
	}
	
	//delete mapping = request mapping + delete method
	// i.e , @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	//@DeleteMapping("delete/{id}")
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public  Product deleteProduct(@PathVariable("id") int id) {
		
		return service.deleteProduct(id);
		
	}
	

}

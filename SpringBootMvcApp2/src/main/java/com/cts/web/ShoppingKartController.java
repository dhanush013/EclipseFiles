package com.cts.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Product;

@Controller
@RequestMapping("/shopping")
public class ShoppingKartController {
	
	@RequestMapping("/page1")
	public String shoppingPage(ModelMap map) {
		Product product = new Product();
		map.addAttribute("product", product);
		return "shoppingPage";
	}

}

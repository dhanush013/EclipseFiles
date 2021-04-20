package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Product;
import com.cts.model.ProductOrder;

public class ProductMain {
	
	public static void main(String[] args) {
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("beans.xml");
		
		Product product= beanFactory.getBean("prd1",Product.class);
		
		System.out.println("Product Details");
		System.out.println("prd id "+product.getPrdId());
		System.out.println("prd name "+product.getPrdName());
		System.out.println("prd cost "+product.getPrdCost());
		
		System.out.println("---------------Order Details---------------");

		ProductOrder prdOrder= product.getPrdOrder();
		
		System.out.println("Order Id "+prdOrder.getOrderId());
		System.out.println("Order Date "+prdOrder.getOrderDate());
		System.out.println("Order Delivery Date "+prdOrder.getOrderDeliveryDate());
		System.out.println("Order Location "+prdOrder.getOrderLocation());
		
		
	}

}

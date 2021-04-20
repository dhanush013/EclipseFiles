package com.cts.model;

import java.util.Date;

public class ProductOrder {
	
	private int orderId;
	private Date orderDate;
	private Date orderDeliveryDate;
	private String orderLocation;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getOrderDeliveryDate() {
		return orderDeliveryDate;
	}
	public void setOrderDeliveryDate(Date orderDeliveryDate) {
		this.orderDeliveryDate = orderDeliveryDate;
	}
	public String getOrderLocation() {
		return orderLocation;
	}
	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}
	
	

}

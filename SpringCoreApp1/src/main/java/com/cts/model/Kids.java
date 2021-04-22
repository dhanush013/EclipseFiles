package com.cts.model;

import org.springframework.beans.factory.annotation.Required;

public class Kids {
	
	private int kidsId;
	private String kidsName;
	private int kidsAge;
	
	public int getKidsId() {
		return kidsId;
	}
	
	@Required
	public void setKidsId(int kidsId) {
		this.kidsId = kidsId;
	}
	
	public String getKidsName() {
		return kidsName;
	}
	public void setKidsName(String kidsName) {
		this.kidsName = kidsName;
	}
	public int getKidsAge() {
		return kidsAge;
	}
	public void setKidsAge(int kidsAge) {
		this.kidsAge = kidsAge;
	}
	
	

}

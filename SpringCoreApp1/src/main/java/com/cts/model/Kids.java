package com.cts.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Kids {
	
	private int kidsId;
	private String kidsName;
	private int kidsAge;
	
	//@Autowired
	//@Qualifier("home2")
	@Resource(name="home1")
	//resource - for specifying the particular bean.
	//autowired - automatically connects the bean.
	//if more than one bean present then we have to use qualifier to mention which bean is to be selected.
	private Home home;
	
	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

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

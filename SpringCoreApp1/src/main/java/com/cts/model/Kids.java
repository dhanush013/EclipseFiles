package com.cts.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Kids {
	
	private int kidsId;
	private String kidsName;
	private int kidsAge;
	
	@PostConstruct
	/*used when the values need to be below after starting the code*/
	public void kidInit() {
		kidsId=1;
		kidsName="Muthu";
		kidsAge=4;
		System.out.println("Kids init Called");
		
	}
	
	@PreDestroy
	public void kidDestroy() {
		System.out.println("Kids bean instance has been destroyed");
	}
	
	
	
	//@Autowired
	//@Qualifier("home2")
	//@Resource(name="home1")
	@Inject
	
	/*
	 	*resource - for specifying the particular bean.
	 	*autowired - automatically connects the bean.
	 	*inject can be used instead of auto wired. but it can only be usen when only one bean is there.
	 	*if more than one bean present then we have to use qualifier to mention which bean is to be selected.
	 	*ctrl+shift+/ - for commenting
	*/
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

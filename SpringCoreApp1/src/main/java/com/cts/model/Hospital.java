package com.cts.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

// making it as a component for scanning
@Component
public class Hospital {
	
	private int hospitalRegNo;
	private String hospitalName;
	private String hospitalLocation;
	
	@PostConstruct
	public void init() {
		
		hospitalRegNo=677676;
		hospitalName="Apollo Hospitals";
		hospitalLocation="Chennai";
		
		System.out.println("Hospital init called");
	}
	
	public int getHospitalRegNo() {
		return hospitalRegNo;
	}
	public void setHospitalRegNo(int hospitalRegNo) {
		this.hospitalRegNo = hospitalRegNo;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalLocation() {
		return hospitalLocation;
	}
	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}
	
	

}

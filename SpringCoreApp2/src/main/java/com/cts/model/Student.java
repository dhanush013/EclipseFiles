package com.cts.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;

public class Student {
	
	private int studentId;
	private String studentName;
	private float studentMarks;
	
	@PostConstruct
	public void init() {
		System.out.println("Student init Called");
		studentId=12;
		studentName="S Kumar";
		studentMarks=80;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	

}

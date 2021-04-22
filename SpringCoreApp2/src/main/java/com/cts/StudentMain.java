package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.model.Appconfig;
import com.cts.model.Student;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Appconfig.class);
		
		Student student= applicationContext.getBean(Student.class);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentMarks());
		
	}

}

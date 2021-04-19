package com.cts.format;

import java.text.DecimalFormat;

public class FormatDemo1 {
	
	public static void main(String[] args) {
		
		float salary=20000.6166612312f;
		String name="Ram Kumar";
		String loc="delhi";
		
		System.out.println("\nsalary "+salary+"\nname "+name+"\nlocation "+loc);
		
		System.out.printf("\n\nsalary %f \nName %s \nLocation %s",salary,name,loc);
		
		System.out.printf("\n%.2f",salary);
		System.out.printf("\n%5.2f",salary);
		System.out.printf("\n%20.2f",salary);
		
		System.out.format("\n%20.2f",salary);
		
		DecimalFormat decimalformat=new DecimalFormat("##,###,##.00");
		
		String s1=decimalformat.format(salary);
		System.out.println();
		System.out.println(s1);
		
		
		
	}	
}

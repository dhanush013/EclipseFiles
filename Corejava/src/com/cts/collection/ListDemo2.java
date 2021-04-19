package com.cts.collection;

import java.util.*;

public class ListDemo2 {
	
	public static void main(String[] args) {
		
		List<String> cityList=new ArrayList<>();
		List<String> cityList1=new ArrayList<>();
		
		cityList.add("Chennai7");
		cityList.add("Chennai6");
		cityList.add("Chennai5");
		cityList.add("Chennai4");
		cityList.add("Chennai3");
		cityList.add("Chennai2");
		cityList.add("Chennai1");
		cityList.add("Chennai");
		//cityList.add(13214); cannot add int values to string list
		
		cityList1.add("Bangalore1");
		cityList1.add("Bangalore2");
		cityList1.add("Bangalore3");
		cityList1.add("Bangalore4");
		cityList1.add("Bangalore5");
		cityList1.add("Bangalore6");
		cityList1.add("Chennai");
		
		cityList.addAll(cityList1);
		System.out.println(cityList.containsAll(cityList1));
		cityList.retainAll(cityList1);
		
		System.out.println(cityList1);
		System.out.println(cityList);
		
		/*
		for(String string : cityList) {
			System.out.println(string);
		}
		*/
		
	}

}

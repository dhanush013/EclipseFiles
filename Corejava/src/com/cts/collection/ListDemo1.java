package com.cts.collection;

import java.util.*;

public class ListDemo1 {
	
	public static void main(String[] args) {
		
		List<String> cityList=new ArrayList<>();
		
		cityList.add("Chennai7");
		cityList.add("Chennai6");
		cityList.add("Chennai5");
		cityList.add("Chennai4");
		cityList.add("Chennai3");
		cityList.add("Chennai2");
		cityList.add("Chennai1");
		cityList.add("Chennai");
		//cityList.add(13214); cannot add int values to string list
		
		System.out.println(cityList.contains("Chennai4"));
		
		cityList.remove("Chennai4");
		cityList.remove(0);
		
		System.out.println(cityList.contains("Chennai4"));
		
		
		System.out.println(cityList);
		for(String string : cityList) {
			System.out.println(string);
		}
		
		
	}

}

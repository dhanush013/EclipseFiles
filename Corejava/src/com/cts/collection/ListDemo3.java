package com.cts.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo3 {
	public static void main(String[] args) {

		ArrayList<String> cityList=new ArrayList<>();
		
		cityList.add("Chennai7");
		cityList.add("Chennai6");
		cityList.add("Chennai5");
		cityList.add("Chennai4");
		cityList.add("Chennai3");
		cityList.add("Chennai2");
		cityList.add("Chennai1");
		cityList.add("Chennai");
		
		System.out.println(cityList);
		
		Collections.sort(cityList);
		
		for(String string : cityList) {
			System.out.println(string);
		}
		
		int pos=Collections.binarySearch(cityList, "Chennai4");
		System.out.println(pos);
		
		System.out.println(Collections.max(cityList));
		System.out.println(Collections.min(cityList));
		
	
		
	
	}

}

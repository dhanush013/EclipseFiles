package com.cts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo5 {
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
		
		Iterator<String> it= cityList.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		ListIterator<String> li = cityList.listIterator();
		System.out.println("---------------First to last--------------");
		
		while(li.hasNext())
			System.out.println(li.next());
		
		System.out.println("---------------Last to first--------------");
		
		while(li.hasPrevious())
			System.out.println(li.previous());
		
		// so by default u cant  put li.hasprevious because iterator always starts from 0
		
		
		
	}

}

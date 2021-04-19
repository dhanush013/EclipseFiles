package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Integer(123));
		list.add(1333);
		list.add("Chennai");
		//list.add(new Employee());
		
		System.out.println(list);
		
	}

}

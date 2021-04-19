package com.cts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		
		List<String> product_list=new ArrayList<String>();
		
		product_list.add("Java Book");
		product_list.add("Math Book");
		product_list.add("English Book");
		product_list.add("Tamil Book");
		product_list.add("Csharp Book");
		
		int arr[]= {1,2,3,44,55,6,7,8,99,12,15};
		
		Arrays.stream(arr).forEach(a->System.out.println(a));
		
		System.out.println("USing filtert even no. only ");
		
		Arrays.stream(arr).filter(a->(a%2==0)).forEach(a->System.out.print(a+" "));
		System.out.println("-------------------");
		
		Stream.of(1,2,3,4,5).forEach(a->System.out.print(a+", "));
		System.out.println("Using Map");
		
		Stream.of(1,2,3,4,5).map(p->p*p).forEach(a->System.out.print(a+", "));
		
		System.out.println("---------------");
		
		product_list.stream().forEach(a-> System.out.println(a));
		
	}

}

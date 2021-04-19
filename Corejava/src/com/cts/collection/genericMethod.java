package com.cts.collection;

import java.util.Arrays;

public class genericMethod {
	
	public static <A> void getValues(A[] a){
		for(A a2:a) {
			System.out.print(a2+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Integer ar[]= {1,2,3,4};
		Character ar1[]= {'a','b','c','d','e'};
		String ar2[]= {"wqesd","wqasd","asd"};
		getValues(ar);
		getValues(ar1);
		getValues(ar2);
		getValues(new Float[] {11.2f,22.3f,55.4f,66.9f});
	
	}

}

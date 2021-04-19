package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

class StringReverse implements Comparator<String>{
	
	
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}


public class ReversestringArray {
	
	public static void main(String[] args) {
		
		String food[]= {"pongal","dosa","idly","poori","fried rice","momos"};
		System.out.println(Arrays.toString(food));
		Arrays.sort(food);
		System.out.println(Arrays.toString(food));
		Arrays.sort(food,new StringReverse());
		System.out.println(Arrays.toString(food));
		
	}

}

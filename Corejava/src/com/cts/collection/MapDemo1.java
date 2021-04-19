package com.cts.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class MapDemo1 {
	
	public static void main(String[] args) {
		Map<Integer, String> map1=new HashMap<Integer, String>();
		
		map1.put(10001, "Math");
		map1.put(10002, "Science");
		map1.put(10003, "Math");
		map1.put(10001, "Tamil");
		map1.put(10004, "Computer");
		
		System.out.println(map1);
		System.out.println(map1.get(10001));
		System.out.println(map1.get(10003));
		
		Set<Integer> keyset= map1.keySet();
		
		map1.remove(10001);
		System.out.println(map1.containsKey(10002));
		System.out.println(map1.containsValue("Tamil"));
		for(Integer key:keyset) {
			System.out.println(key+" "+map1.get(key));
		}
		
		Collection<String> val=  map1.values();
		
		System.out.println(val);
		for(String string:val) {
			System.out.println(string);
		}
		
		System.out.println("------- Entry Set -------");
		
		Set<Entry<Integer, String>> entryset = map1.entrySet();		
		
		for(Entry<Integer,String> entry:entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
				
	}
	

}

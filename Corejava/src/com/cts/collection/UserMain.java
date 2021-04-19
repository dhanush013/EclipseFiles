package com.cts.collection;

public class UserMain {
	
	public static void main(String[] args) {
		
		User user=User.getInstance();
		
		user.setUserId(101);
		user.setUserName("Suresh Kumar");
		user.setUserLocation("Chennai");
		
		User user1=User.getInstance();
		
		/*user1.setUserId(102);
		user.setUserName("Kumar");
		user.setUserLocation("Bangalore");
		*/
		
		System.out.println(user.getUserId() +" "+user.getUserName()+" "+user.getUserLocation()+" ");
		System.out.println(user1.getUserId() +" "+user1.getUserName()+" "+user1.getUserLocation()+" ");
	}
}

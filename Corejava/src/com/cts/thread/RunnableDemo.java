package com.cts.thread;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		Runnable runnable=()->{
			for(int i=0;i<21;i++)
				System.out.println(i+" "+ Thread.currentThread().getName());
			
		};
		
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		Thread t3=new Thread(runnable);
		
		t1.setName("Task 1");
		t2.setName("Task 2");
		t3.setName("Task 3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

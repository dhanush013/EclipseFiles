package com.cts.collection;

public class GenericClass<A,B> {
	
	private A a;
	private B b;
	
	public GenericClass(A a,B b) {
		this.b=b;
		this.a=a;
		
	}

	public void addition() {
		System.out.println(a.toString()+b.toString());
	}
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	
	public static void main(String[] args) {
		
		GenericClass<String, String> class1=new GenericClass<String, String>("Hello","World");
		class1.addition();

		GenericClass<Integer, Integer> class2=new GenericClass<Integer, Integer>(1000,20);
		class2.addition();
		
	}
	

}

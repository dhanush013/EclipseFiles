package cts.com.core;

public class CircleMain {
	
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.setRadius(5.6f);
		
		float ar= circle.circleArea();
		System.out.println("Circle With Radius "+circle.getRadius()+" Area is "+ar);
		
	}

}

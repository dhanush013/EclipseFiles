import java.util.Scanner;

public class Distance {
	 // code yet to complete
	
	float value;
	
	void convkm(float value,char type) {
		if(type=='f') {
			System.out.println("KM value is "+(value*0.0003048f));
			System.out.println("M value is"+(value*0.03048f));
		}
		
		else if(type=='i') {
			System.out.println("KM value is"+(value*0.000254f));
			System.out.println("M value is"+(value*0.0254f));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		
		int feet,inch;
		char type;
		
		feet=a.nextInt();
		inch=a.nextInt();
		type=a.next().charAt(0);
		
		
		
		
		
	}
	
}

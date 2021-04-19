import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		int x,y,z;
		
		String name= sc.nextLine();
		System.out.println("Enter Two Number");
		x=sc.nextInt();
		y=sc.nextInt();
		z=x+y;
		System.out.println("sum is "+z);
		
	}

}

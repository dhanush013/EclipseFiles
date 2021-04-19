import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x=1234;
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter The Number");
		int x=aa.nextInt();
		int a,sum=0;
		while (x!=0) {
			
			a=x%10;
			sum+=a;
			x=x/10;
			
		}
		System.out.println(sum);
		
	}

}

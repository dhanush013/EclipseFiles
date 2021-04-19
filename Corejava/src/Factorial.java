import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int k=1;
		int fact=1;
		while(k<=p) {
			fact=k*fact;
			k++;
		}
		System.out.println(fact);

	}

}

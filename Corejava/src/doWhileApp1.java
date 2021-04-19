import java.util.Scanner;

public class doWhileApp1 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=0;
		
		do {
			System.out.println("Enter a Positive Number");
			n=scanner.nextInt();
		}while(n<=0);
		System.out.println("We Got The Number");
		
	}

}

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		boolean status=false;
		int count=2;
		do {
			if(n%count==0)
			{
				status=true;
				break;
			}
			count++;
		}
		while(count<n);
		if(status)
			System.out.println("Not prime");
		else
			System.out.println("Is prime");
	}

}

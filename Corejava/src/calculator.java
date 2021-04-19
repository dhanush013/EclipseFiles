import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter No. 1");
		int x=a.nextInt();
		
		System.out.println("Enter No. 2");
		int y=a.nextInt();
		
		System.out.println("Select Operation");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("4. Div");
		//char op=a.next().charAt(0);
		int op=a.nextInt();
		
		if(op==1) {
			System.out.println("Add is "+(x+y));
		}
		
		else if(op==2) {
			System.out.println("Sub is "+(x-y));
		}
		else if(op==3) {
			System.out.println("Mul is "+(x*y));
		}
		else if(op==4) {
			System.out.println("Div is "+(x/y));
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
		switch(op) {
		
		case 1:
			System.out.println("Add is "+(x+y));
			break;
		case 2:
			System.out.println("Sub is "+(x-y));
			break;
		case 3:
			System.out.println("Mul is "+(x*y));
			break;
		case 4:
			System.out.println("Div is "+(x/y));
			break;
		default:
			System.out.println("Invalid Input");
			break;
		
		}
		
		
	}
}

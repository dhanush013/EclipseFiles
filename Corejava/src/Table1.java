import java.util.Scanner;

public class Table1 {
	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int p=a.nextInt();
		int k=1;
		while(k<=10) {
			System.out.println(p+" * "+k+" = "+(k*p));
			k++;
		}
		
	}

}

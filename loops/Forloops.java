package loops;
import java.util.Scanner;

public class Forloops {

	public static void main(String[] args) {
		
		Scanner j = new Scanner(System.in);
//		System.out.println("Enter the number of terms:");
//		int z = j.nextInt();
//		
//		//factorial
//		for (int i=5;i>0;i--) {
//			
//			p*=i;
//			
//		}
//		System.out.println("The factorial of 5 is "+p);
//		int a=0;
//		int b=1;
//		
//		System.out.println("0");
//		System.out.println("1");
//		
//		for (int k=0;k<z-2;k++) {
//			
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
			
			
//		}
		//power
		
		int a = j.nextInt();
		int f = j.nextInt();
		int result = 1;
		
		for ( int b = 0;b<f;b++) {
			
			result *=a;
			
			
		}
		System.out.println(result);
		
		
		}
		
	}
	



package loops;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		// Ek baar toh loop chale hi chale
		
		Scanner y = new Scanner(System.in);
		int a=1;
		do {
			a = y.nextInt();
			System.out.println("Input Recieved!");
		} while(a!=0);
			
			
		

	}

}

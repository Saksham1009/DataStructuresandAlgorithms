package loops;
import java.util.Scanner;
public class LoopQuestions {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int y = inp.nextInt();
//		int sum = 0;
//		for (int a=2;a<y;a++) {
//			if (y%a!=0) {
//				
//				sum+=1;
//				
//			}
//			
//		}
//		if (sum==(y-2)) {
//			System.out.println("Prime number");
//			
//		}else {
//			
//			System.out.println("Not a Prime Number");
//		}
//		
//		boolean prime = true;
//		
//		for (int z=2;z*z<y;z++) {   //z<root(y) as if a prime number has a factor it will be between 1 and root of the number
//			
//			
//			if (y%z==0) {
//				
//				prime=false;
//				break;
//				
//			}
//		
//			
//		}
//		if (y<2) {
//			prime = false;
//		}
//		System.out.println("The fact this is prime is "+prime);
//		float sum=0f;
//		for (float i=1;i<=y;i++) {
//			
//			sum+=1/i;
//			
//		}
//		System.out.println("The sum is "+sum);
		
		float sum = 0f;
		for (float h = 1;h<=y;h++) {
			
			if (h%2==0) {
				
				sum-=1/h;
				
				
			}else {
				
				sum+=1/h;
			}
			
			
		}
		System.out.println("The sum is "+sum);
		
		
		
		
		
		
	}

}

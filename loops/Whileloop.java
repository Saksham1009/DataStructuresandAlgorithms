package loops;

public class Whileloop {

	public static void main(String[] args) {
//		int k = 2321;
//		int sum=0;
//		while (k!=0) {
//			
//			sum+=k%10;
//			k=k/10;
//			
//			
//			
//		}
//		System.out.println("The sum of digits is "+sum);
		
		
		
		
		
		
		
		
		
// number of digits = (int)Math.log10(n)+1
		
		
		
		
		
		
		
		//Palindrome
		int y= 99801;
		int j = y;
		int r=0;
		while (j!=0) {
			
			int ld = (j%10);
			r=((r*10)+ld);
			j/=10;
			
			
		}
		
		System.out.println(r);	
			
		
	}

	

}

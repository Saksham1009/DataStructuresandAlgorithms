package conditionalstatements;

public class Conditionsbruv{
	
	public static void main(String[] args) {
		
		
		
		// MAXIMUM OF 3 NUMBERS
		int a = 90;
		int b = 1;
		int c = 3;
		
//		if (a>b) {
			
//			if(a>c) {
				
//				System.out.println(a+" is the greatest of the three");
				
//			} else {
				
				
//				System.out.println(c+" is the greatest of the three");
//			}
			
			
//		} else {
//			
//			if (b>c) {
				
				
//				System.out.println(b+" is the greatest of the three");
//			} else {
				
//				System.out.println(c+" is the greatest of the three");
//			}
//			
//		}
//		
	
	
	
		int result = 0;
		result = a>b ? a>c ? a : c : b>c ? b : c;
		System.out.println("The greatest number of the three is:"+result);
	
	
	}
	
}
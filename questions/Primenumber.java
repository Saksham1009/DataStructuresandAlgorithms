package questions;

public class Primenumber {

	public static void main(String[] args) {
		int n=35;
		if (n>0)
		  {	 
	  
	        for (int i = 2; i < n; i++) 
	        { 
	            while (n%i == 0) 
	            { 
	                System.out.print(i + " "); 
	                n /= i; 
	            } 
	        } 
	        if (n > 2) 
	            System.out.print(n); 
	       }

	}

}

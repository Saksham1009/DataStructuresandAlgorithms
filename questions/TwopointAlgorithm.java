package questions;

import java.util.Arrays;
import java.util.Scanner;

public class TwopointAlgorithm {
	// if sum of three digits in the array is 0 print 1 else 0
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int n = a.nextInt();
		int[] list = new int[n];
		int gg = 4;
		
		for (int i=0;i<n;i++) {
			System.out.print("Enter Number:");
			int y = a.nextInt();
			list[i]=y;
		}
		
		
		
		
		
		//noob method as done in O(n cube)
		
		
		
		
		
//		
//		
////		for (int j = 0;j<n;j++) {
////			System.out.println(list[j]);
//			
//		//}
//		for (int i = 0;i<n;i++) {
//			for(int j = 1;j<n;j++) {
//				for(int k=2;k<n;k++) {
//					
//					if (list[i]+list[j]+list[k]==0) {
//						gg=1;
//						break;
//					}
//				}
//				
//			}
//			
//			
//		}
//		if(gg==1) {
//			System.out.println(1);
//		}else {
//			System.out.println(0);
//		}
//		
		
		
		
		//two point algorithm pro method
		
		
		
		
		
		
		
		
		
		//two sum
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//for loop(not always correct)
		
		
		
		
		
		
//		int jj = 0;
//		int x = 5;
//		int i = 0;
//		int j = list.length-1;
//		for (int k = 0;k<n;k++) {
//			
//			if (list[i]+list[j]==x) {
//				jj=1;
//				break;
//				
//				
//			}else if(i<j){
//				i++;
//			}else if(j<i){
//				j--;
//			}
//			
//			
//			
//		}
//		if (jj==1) {
//			System.out.println("Sum is found!");
//		}else {
//			System.out.println("Sum is not found!");
//		}

	
		// while loop
		
//		int jj= 0;
//		int i = 0;
//		int j = list.length-1;
//		int x = 5;
//		while(i<j) {
//			
//			if(list[i]+list[j]>x) {
//				j--;
//				
//			
//			}else if(list[i]+list[j]==x){
//				jj=1;
//				break;
//				
//				
//			}else {
//				i++;
//				
//			}
//			
//		}
//		if(jj==1) {
//			System.out.println("Sum found!");
//		}else {
//			System.out.println("Sum not found!");
//		}
//	
//		
		
		
		
		
		
		
		
		
		
		
		//three sum
		
		
		
		
		
		Arrays.sort(list);
		int i=0;
		int j = list.length-1;
		//return true is sum is 0
		int jj = 0;
		int kok = 0;
		while (i<j) {
			
			kok = list[i];
			if (list[i+1]+list[j]>(-kok)) {
				j--;
			}else if (list[i+1]+list[j]<(-kok)) {
				i++;
			}else if (list[i+1]+ list[j]==(-kok)) {
				jj = 1;	
				break;
				
			}
			
			
		}
		if (jj==1) {
			System.out.println("Sum found!");
		}else {
			System.out.println("Sum not found!");
		}
		
	
	}
	
	

}

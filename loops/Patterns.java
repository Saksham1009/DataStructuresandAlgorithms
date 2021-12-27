package loops;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int g = i.nextInt();
//		for (int a=0;a<g;a++) {
//			
//			for (int b=0;b<g;b++) {
//				
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//
	//	}
	
	
//Tough pattern below
	
	
	
//		for (int y = 1;y<=g;y++) {
//			
//			
//			for (int j = 1;j<=y-1;j++) {
//				
//				
//				System.out.print(" ");
//				
//			} 
//			for (int d = 1;d<=g-y+1;d++) {
//				
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		
		
		
		
		
//		for (int m=g;m>0;m--) {
//			
//			
//			for (int l = m;l>0;l--) {
//				
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			
//			
//		}
		
		
	//bhery difficult 	
//		for (int v = 1;v<=g;v++) {
//			
//			for (int s = (g-v);s>0;s--) {
//				
//				System.out.print(" ");
//				
//			}
//			for (int t = 1;t<=v;t++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//bhery bhery difficult
		
//		for (int l = 1;l<=g;l++) {
//			
//			for(int x = (g-l);x>0;x--) {
//				
//				System.out.print("  ");
//				
//			}
//			for (int j = 1;j<=l;j++) {
//				
//				System.out.print("*  ");
//			}
//			for (int z = ((g-l)-2);z>0;z--) {
//				
//				System.out.print("  ");
//				
//			}
//			System.out.println();
//			
//		}
//			int number = 1;
//			for (int l = 1;l<=g;l++) {
//				
//				for(int x = (g-l);x>0;x--) {
//					
//					System.out.print("  ");
//					
//				}
//				for (int j = 1;j<=l;j++) {
//					
//					System.out.print(number++ +"  ");
//				}
//				for (int z = ((g-l)-2);z>=0;z--) {
//					
//					System.out.print("  ");
//					
//				}
//				System.out.println();
//				
//			}
		
//		for (int s=1;s<=g;s++) {
//			
//			for (int k = s;k>0;k--) {
//				
//				System.out.print("* ");
//				
//			}
//			System.out.println();
//		}
//		for (int u =(g-1);u>0;u--) {
//				
//			for (int j = u;j>0;j--) {
//					
//				System.out.print("* ");
//				}
//			System.out.println();
//			}
//		
//		
		
		
		System.out.println("*");
		
		
		
		for (int p = 2;p<=(g-1);p++) {
			
			
			System.out.print("* ");
			for (int l = 1;l<=(p-2);l++) {
				
				System.out.print("  ");
				
			}
			System.out.println("*");
		}
		
		
		
		
		
		for (int k = 1; k<=g;k++) {
			
			
			System.out.print("* ");
		}
		
		}
		
		
		
	}



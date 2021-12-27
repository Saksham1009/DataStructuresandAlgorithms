package arrays;

import java.util.Scanner;

public class Multidimentionalarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows for set 1:");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns for set 1:");
		int col = sc.nextInt();
		int set1[][]= new int[rows][col];
		System.out.print("Enter the number of rows for set 2:");
		int rows2 = sc.nextInt();
		System.out.print("Enter the number of columns for set 2:");
		int col2 = sc.nextInt();
		int set2[][]= new int[rows2][col2];
		
		for (int i=0;i<rows;i++) {
			
			for (int j=0;j<col;j++) {
				
				set1[i][j]=sc.nextInt();
				
				
			}
			
		}
		for (int i=0;i<rows2;i++) {
					
					for (int j=0;j<col2;j++) {
						
						set2[i][j]=sc.nextInt();
						
						
					}
		}
		
		
		//addition of matrix through array 
		
		
		
//		int sum[][]=new int[rows][col];
//		for (int u=0;u<rows;u++) {
//			
//			for(int j = 0;j<col;j++) {
//				
//				sum[u][j]=(set1[u][j]+set2[u][j]);
//				
//			}
//			
//		}
//		for (int h = 0; h<rows;h++) {
//			
//			for (int j = 0;j<col;j++) {
//				
//				System.out.print(sum[h][j]+"  ");
//				
//			}
//			System.out.println();
//		}
		
		
		
		
		//multiplication of matrix through array
		
		
		
		
		if (col!=rows2) {
			
			System.out.println("Dimensions are not compatible for multiplication!");
			
			
		} else {
			
			int prod[][]=new int[rows][col2];
			for (int i = 0;i<rows;i++) {
				
				for (int j = 0;j<col2;j++) {
					
					for (int p = 0;p<col2;p++) {
					prod[i][j]+=((set1[i][p])*(set2[p][j]));
					}
					
				}
				
			}
			for (int n=0;n<rows;n++) {
				
				for(int o=0;o<col2;o++) {
					
					System.out.print(prod[n][o]+ " ");
					
				}
				System.out.println();
				
			}
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}

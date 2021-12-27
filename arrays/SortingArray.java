package arrays;

public class SortingArray {

	public static void main(String[] args) {
	

		
		
	//BUBBLE SORT
		
		
		
//		int ar[]= {1,2,3,4,5};
//		for (int i=0;i<(ar.length)-1;i++) {
//			
//			for (int j=0;j<(ar.length)-1-i ;j++) {
//				
//				if (ar[j+1]<ar[j]) {
//					
//					int k = ar[j+1];
//					ar[j+1]=ar[j];
//					ar[j]=k;
//				}
//				
//				}
//				
//			} 
//			
//			
//		//1
//		for (int y =0;y<ar.length;y++) {
//			
//			System.out.print(ar[y]);}
//		
//		System.out.println();
//		
//		//2
//		for (int item: ar) {
//			System.out.print(item+ " ");
//		
//			
//		}
		
		
		
		
		
		
		//SELECTION SORT
		
		
		
		int main[] = {5,2,-1,0};
		for(int i=0;i<main.length;i++) {
			int min = i;
			for (int j=i;j<main.length;j++) {
				
				if (main[min]>main[j]) {
					
					min = j;
					
				}
				
			}
			int y = main[i];
			main[i]=main[min];
			main[min]=y;
		}
		
		
		
		
		for (int a: main) {
			System.out.print(a);
		}
		
		
		
		
		
	}

}

package questions;

import java.util.Arrays;
import java.util.Scanner;

public class KGquestionHackerrank {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int y = a.nextInt();
		int[] inp = new int[y];
		System.out.println("Enter the marks:");
		for(int i=0;i<y;i++) {
			inp[i]=a.nextInt();
		}
		
		
		
		
		//NON-EFFECIENT METHOD!
		
		
		
		
//		int[] out = new int[inp.length];
//		for(int i=0;i<out.length;i++) {
//			 out[i]=1;
//		}
//		for(int i=0;i<inp.length;i++) {
//			if(i==0) {
//				if(inp[i]>inp[i+1]) {
//					out[i]=out[i+1]+1;
//				}
//			}else if(i==inp.length-1) {
//				if(inp[inp.length-1]>inp[inp.length-2]) {
//					out[inp.length-1]=out[inp.length-2]+1;
//				}
//			}else {
//				if(inp[i]>inp[i-1] && inp[i]>inp[i+1]) {
//					if(inp[i-1]>inp[i+1]) {
//						out[i]=out[i-1]+1;
//					}else {
//						out[i]=out[i+1]+1;
//					}
//				}else if(inp[i]>inp[i-1] && inp[i]==inp[i+1]){
//					out[i]=out[i-1]+1;
//				}else if(inp[i]==inp[i-1] && inp[i]>inp[i+1]){
//					out[i]=out[i+1]+1;
//				}else if (inp[i]>inp[i-1] && inp[i]<inp[i+1]) {
//					out[i]=out[i-1]+1;
//				}else if(inp[i]<inp[i-1] && inp[i]>inp[i+1]) {
//					out[i]=out[i+1]+1;
//				}
//			}
//		}
//		int sum=0;
//		for(int i=0;i<out.length;i++) {
//			sum+=out[i];
//		}
//		System.out.println("The minimum number of chocolates to be bought are "+sum);

		
		
		//Effecient method
		
		
		
		int[] out = new int[inp.length];
		Arrays.fill(out, 1);
		for(int i=1;i<inp.length;i++) {
			if(inp[i]>inp[i-1]) {
				out[i]=out[i-1]+1;
			}
		}
		for(int i=inp.length-2;i<=0;i--) {
			if(inp[i]>inp[i+1]) {
				out[i]=Math.max(out[i+1]+1, out[i]);
			}
		}
		int sum =0;
		for(int i=0;i<out.length;i++) {
			sum+=out[i];
		}
		System.out.println("minimun chocolates required are "+sum);
		
		
	}

}

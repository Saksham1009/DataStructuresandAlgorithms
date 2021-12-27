package csc115;

import java.util.Scanner;

public class Firstclass {

	public static void main(String[] args) {
		int data[] = new int[10];
		
		for(int i=0;i<data.length;i++) {
			data[i]=i+1;
		}
//		for(int i=0;i<data.length;i++) {
//			System.out.print(data[i]+" ");
//		}
//		// to add a new element in the index place 0
//		int newdata[] = new int[data.length+1];
//		Scanner a = new Scanner(System.in);
//		int val = a.nextInt();
//		newdata[0]=val;
//		for(int i=1;i<newdata.length;i++) {
//			newdata[i]=data[i-1];
//		}
//		for(int i=0;i<newdata.length;i++) {
//			System.out.print(newdata[i]+" ");
//		}
		System.out.println(data[3]);
	}

}

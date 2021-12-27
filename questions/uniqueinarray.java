package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class uniqueinarray {

	public static void main(String[] args) {
		
		int[] messi = new int[5];
		Scanner inp = new Scanner(System.in);
		for(int i=0;i<messi.length;i++) {
			System.out.print("Enter element:");
			messi[i]=inp.nextInt();
		}
		for(int k: messi) {
			System.out.print(k);
		}
		System.out.println();
		System.out.println("End of this input list!");
//		int temp=0;
//		ArrayList<Integer> g = new ArrayList();
//		for(int i=0;i<messi.length;i++) {
//			for(int j=0;j<messi.length;j++) {
//				if(messi[i]==messi[j]) {
//					temp++;
//				}
//			}
//			if(temp==1) {
//				g.add(messi[i]);
//			}else {
//				temp=0;
//			}
//		}
//		System.out.println("Start of unique list!");
//		for(int u: g) {
//			System.out.print(u);
//		}
//		System.out.println();
//		if(g.size()==0) {
//			System.out.println("No Unique element!");
//		}else {
//			System.out.println(g.get(g.size()-1)+" is the last unique element in the list!");
//		}
		HashMap<Integer, Integer> di = new HashMap<>();
		
		for(int i=0;i<messi.length;i++) {
			di.put(messi[i], i);
		}
		ArrayList<Integer> y = new ArrayList();
		for(int j:di.keySet()) {
			y.add(j);
		}
		System.out.println(y.get(y.size()-1));
	}

}

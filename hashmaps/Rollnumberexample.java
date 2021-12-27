package hashmaps;

import java.util.Scanner;

import java.util.HashMap;

public class Rollnumberexample {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		HashMap<Integer,String> cl = new HashMap<>();
		System.out.print("Enter the size of Class:");
		int classsize = i.nextInt();
		i.nextLine();
		for(int j=0;j<classsize;j++) {
			System.out.print("Enter the name of roll no "+(j+1)+":");
			String name = i.nextLine();
			cl.put((j+1), name);
		}
		display(cl);
		surprise(cl);
	}
	public static void display(HashMap hm) {
		for(Object i: hm.keySet()) {
			System.out.println("Roll No "+i+" is "+hm.get(i));
		}
	}
	public static void surprise(HashMap hi) {
		
			Scanner k = new Scanner(System.in);
			System.out.println(hi);
			for(Object i: hi.keySet()) {
				System.out.println(i);
			}
		
	}
		
	

}

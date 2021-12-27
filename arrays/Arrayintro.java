package arrays;
import java.util.Scanner;
public class Arrayintro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		int[] marks = new int[5];
		int sum=0;
		for (int i=0;i<n;i++) {
			System.out.println("Enter the marks of student "+(i+1));
			marks[i]=sc.nextInt();
			
		}
		for (int i=0;i<marks.length;i++) {
			
			sum+=marks[i];
			
		}
		System.out.println("The average marks are "+(sum/n));
	}

}

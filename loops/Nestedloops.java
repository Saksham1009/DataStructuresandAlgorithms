package loops;

public class Nestedloops {

	public static void main(String[] args) {
		//table of 20X20
		int a= 20;
		int b=20;
		for (int i=1;i<=20;i++) {
			
			for (int j=1;j<=20;j++) {
				
				System.out.print(i*j+"    ");
				
			}
			System.out.println();
		}

	}

}

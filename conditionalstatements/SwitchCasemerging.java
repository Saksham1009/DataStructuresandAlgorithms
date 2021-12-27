package conditionalstatements;

public class SwitchCasemerging {

	public static void main(String[] args) {
		int day = 2;
		
		switch (day) {
		// this is merging
		case 1:
		case 2:
			System.out.println("This is 1 or 2");
			break;
		case 3:
			System.out.println("This is 3");
			break;
		default: 
			System.out.println("I dont know about this");
		
		}
		

	}

}

package conditionalstatements;
import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner o = new Scanner(System.in);
		char answer = o.nextLine().charAt(0);
		int a = o.nextInt();
		int b = o.nextInt();
		int result = 0;
		switch (answer) {
		
//		case 'a':
//			System.out.println("The sum is "+ (a+b));
//			break;
//		case 's':
//			System.out.println("The difference is "+(a-b));
//			break;
//		case 'm':
//			System.out.println("The product is "+(a*b));
//			break;
//		case 'd':
//			System.out.println("The quotient is "+(a/b));
//			break;
//		default:
//			System.out.println("Invalid operation for calculator");
			
				
		
		
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
			default:
				System.out.println("invalid operation for calculator");
		}
		System.out.println(a+""+answer+""+b+" is "+result);
			
		
		
		
		}

	}



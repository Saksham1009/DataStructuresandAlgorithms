package exceptionhandling;

public class Trycatch {

	public static void main(String[] args) {
		boolean gg = true;
		fun1();
		
		
		
		
		//thread.sleep for delay in processing
		
		
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage()+" occured bro!");
		}
		fun1();
//		try {
////			int a= 5;
////			int b=0;
////			int y = a/b;
////			System.out.println(y);
//			int[] r = new int[4];
//			System.out.println(r[5]);
//		
//		}catch(ArithmeticException jobhi) {
//			System.out.println(jobhi.getMessage()+" has occured please check!");
//		}catch(IndexOutOfBoundsException e) {
//			System.out.println(e.getMessage()+" has taken place, please check the index range!");
//			
//			
//			//finally works/executes irrespective of catch found or not!
//		}finally {
//			System.out.println("I will be executed anyways!");
//		}if(gg){
//			throw new ArrayIndexOutOfBoundsException("Danger was coming init!");
//		}
//		System.out.println("try catch does not stop the code, just throws an exception and keeps rest of the code running!");

	}
	static void fun1() {
		try {
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage()+" occured!");
		}
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		// This throws keyword helps to get an exception and use the try catch block in the upper level i.e, in fun1 in this case!
		
		boolean g = true;
		if (g) {
			throw new ArithmeticException("This is not how I wanted it to go");
		}
		
	}

}

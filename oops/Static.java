package oops;

public class Static {

	static {//static block is always run/executed before the main block
		
		System.out.println("Hello i am very very superior :)");
		
	}
	public static void main(String[] args) {
		
		School obj1 = new School();
		School.classes ob2 = obj1.new classes();
		// when there is no static in the class then you need to create an object of the class above it
		School.home obj3 = new School.home();
		//when class is static there is no need to make an object of the class above it
		System.out.println("I am not that superior anymore :(");
	}
	static {
		
		System.out.println("So sad Main, even I am more superior than you :)");
		
	}

}

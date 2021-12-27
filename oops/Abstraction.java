package oops;

public class Abstraction {

	public static void main(String[] args) {
		

		Audi c1 = new Audi();
		c1.price=1000000;
		c1.Start();
		System.out.println("price of the audi is:"+c1.price);
		BMW c2 = new BMW();
		c2.price=2000000;
		c2.Start();
		
	}

}

class Audi extends Car{

	@Override
	void Start() {
		System.out.println("Audi is starting!");
		
	}
	
	
	
	
}

class BMW extends Car{

	@Override
	void Start() {
		System.out.println("BMW is starting!");
		
	}
	
	
	
	
}



abstract class Car {
	
	int price;
	
	abstract void Start();
	
}
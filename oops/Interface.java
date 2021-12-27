package oops;

public class Interface implements Carro, Personn{

	public static void main(String[] args) {
		
		Interface i = new Interface();
		i.start();
		i.walk();

	}

	@Override
	public void start() {
		System.out.println("The car is goinf on to start!");
		
	}

	@Override
	public void walk() {
		System.out.println("The person is goinf on to walk!");
		
	}

}

interface Carro { 
		
	void start();	
}

interface Personn {
	
	void walk();
	
}
package Interface;

public class Person implements Youtuber,Student {
	
	
	
//You can only extend one class using extends whereas Interfaces lets you extend more than one class using keyword implemets
	
	
	
	public static void main(String[] args) { 
		Person p1 = new Person();
		p1.study();
		p1.play();
		p1.learn();
		
		Youtuber y1 = p1;
		y1.play();
		//it is an object of youtuber so only has properties and behavious of the youtuber class
	}

	@Override
	public void study() {
		System.out.println("Student is Studying!");
	}

	@Override
	public void play() {
		System.out.println("Youtuber is playing!");
		
	}
	
	

}

package oops;

public class Inheritence {

	public static void main(String[] args) {
		Person p1 = new Person();
		teacher t1 = new teacher();
		t1.name="Anamika";
		t1.eat();
		t1.teaches();
		t1.walk();
		System.out.println(t1 instanceof teacher);
		System.out.println(t1 instanceof Person);//instance means object
//super is used to access immediate parent class
	}

}
class Person{
	
	String name;
	
	
	void walk() {
		
		System.out.println(name+" is walking!");
		
	}
	
	void eat() {
		
		System.out.println(name+" is eating!");
		
	}
	
	
}

class teacher extends Person {
	
	void teaches() {
		System.out.println(name+" is teaching!");
	}
	void eat() {
		super.eat();
		System.out.println(name+" is eating but wk that is a teacher!");
	}
}
class footballer extends Person{
	
	void plays() {
		System.out.println(name+" is playing football!");
	}
	
}
class singer extends Person{
	
	void sing() {
		System.out.println(name+" is singing!");
	}
}
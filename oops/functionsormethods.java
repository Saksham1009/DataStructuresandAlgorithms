package oops;

public class functionsormethods {
	public int fana(int a) {
		return a;
		
	}

	public static void main(String[] args) {
		
//		functionsormethods f = new functionsormethods();
//		int a = f.fana(6);
//		System.out.println(a);
//		int b = f.greater(4, 5);
//		System.out.println("The greater number is "+b);
//		int resu = greater(5,9);
//		System.out.println("The greater number is "+resu);
//		System.out.println(greater(89,88));
//	}
//	static int greater(int a, int b) {
//		
//		if (a>b) {
//			return a;
//		}else {
//			return b;
//		}
		Dog d1 = new Dog();
		d1.legs=5;
		Dog d2 = new Dog();
		d2.legs=6;
		swap(d1,d2);
		System.out.println(d1.legs+" "+d2.legs);
	// IN NON-PRIMITIVE DATA TYPE pass by REFERENCE(not by value)
		
	}
	static void swap(Dog a, Dog b) {
		
		Dog temp = a;
		a=b;
		b=temp;
//		a.legs = 55;
//		b.legs =88;
		
	}
}
class Dog{
	
	int legs;
}
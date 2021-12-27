package encapsulation;
//PRIVATE-CAN ONLY BE ACCESSED IN THE SAME CLASS FILE
//PUBLIC-CAN BE ACCESSED IN ALL PACKAGES AND OUTSIDE
//DEFAULT-CAN BE ACCESSED IN THE ALL CLASSES OF IMMEDIATE PARENT PACKAGE
//PRIVATE-CAN BE ACCESSES IN THE SAME PACKAGE AND OUTSIDE THE PACKAGE THROUGH THE CHILD CLASS
public class One {
 
	public static void main(String[] args) {
		
		Mobile m1 =  new Mobile();
		m1.setPrice(21545);
		System.out.println("The price is "+m1.getPrice());
		 
	}
	
	public void Dowork() {
		
		System.out.println("I am Working bruv, what else do you want!");
	}
	
	private void Doww() {//can only be accessed here!s
		
		System.out.println("Privately working bro!");
	}
	

}

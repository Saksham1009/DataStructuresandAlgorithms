package encapsulation;



public class EncapsulationExample {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.company="Samsung";
		m1.setPrice(12100);
		System.out.println(m1.company+" has the price of "+m1.getPrice());
		
		
		One o1 = new One();
		//error --> o1.Doww();
		o1.Dowork();
	}

}
class Mobile{
	
	private int price;
	String company;
	public void setPrice(int Newprice) {
		if (Newprice>100000) {
			
			System.out.println("You cannot keep the price so high bruv, we are not apple");
			
		}else {
			
			price = Newprice;
			System.out.println("Price has been set!");
			
			
		}
		
		
		

	}
	public int getPrice() {
		return price;
	}
	
	
}
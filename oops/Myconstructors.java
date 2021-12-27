package oops;
class cars{
	int wheels;
	String Color;
	cars(){}
	
	cars(int wheels,String cole){
		
		this.wheels=wheels;
		Color = cole;
		
	
}
}
public class Myconstructors {

	public static void main(String[] args) {
		
		cars c1 = new cars(5,"yellow");
		System.out.println(c1.wheels+c1.Color);
	}

}

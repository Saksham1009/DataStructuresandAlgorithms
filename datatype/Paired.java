package datatype;

public class Paired<X, Y> {

	X x;
	Y y;
	
	public Paired(X x,Y y) {
		this.x=x;
		this.y=y;
	}
	
	public void getdesc() {
		System.out.println(x+" and "+y);
	}

}

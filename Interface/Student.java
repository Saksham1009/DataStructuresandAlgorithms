package Interface;

public abstract interface Student {
	abstract void study();
	
	default void learn() {
		System.out.println("student is learning!");
	}
	
	//default helps to define a function even in an abstract interface/class, this came in java after java 8.0
	

}

package oops;

import encapsulation.One;

//import java.util.Scanner;
public class ClassnObject {
	
	public static void main(String[] args) {
		
//		Scanner inp = new Scanner(System.in);
//		Coder c1 = new Coder();
//		System.out.print("Enter the name of the employee:");
//		c1.name=inp.nextLine();
//		System.out.print("Enter the Salary of the employee:");
//		c1.salary=inp.nextInt();
//		System.out.print("Enter the company name:");
//		inp.nextLine();
//		c1.companyname=inp.nextLine();
//		
//		System.out.print("Do you want to know about "+c1.name+"?(yes/no):");
//		inp.nextLine();
//
//		String a = inp.nextLine();
//		if (a=="yes") {
//			
//			c1.salary2();
//			c1.company();
//			
//		}
		
//		
//		Coder c1 = new Coder();
		Coder c2 = new Coder(250000,"Microsoft","Shivam");
////		System.out.println(c2.companyname+" emplyees "+c2.name+" and pays him "+c2.salary);
//		c1.name="Saksham";
//		c1.companyname="Google";
//		c1.salary=10000000;
////		System.out.println(c1.companyname+" employees "+c1.name+" and pays him "+c1.salary);
//		System.out.println("The number of entries are "+Coder.count);
//		c1.salary2();
//		c2.salary2();
//		
		dev d1 = new dev(300000,"Tseries","Darshan");
//		System.out.println(d1.companyname);
		d1.salary2(121);
		d1.company();
		
		One g = new One();
		
		g.Dowork();
		
	}

	
}
class dev extends Coder{

	public dev(int Salaryy, String Comp, String newname) {
		super(Salaryy, Comp, newname);
		
	}
	
	void salary2(int ji) {
		
		System.out.println(name+" is now earning "+ji);
		
	}
	void company() {
		
		System.out.println("Hello");
		
	}

	
	
}


class Coder{
	
	protected int salary;//protected only gives the access of the variable to the children class
	String companyname;
	String name;
	
	static int count;
	
//	public Coder() {
//		count++;
//		System.out.println("New Coder has been added!");
//		
//		
//	}
	
	public Coder(int Salaryy, String Comp, String newname) {
		
		name=newname;
		companyname=Comp;
		salary=Salaryy;
		
		
	}
	
	void company() {
		
		System.out.println(companyname+" is employing "+name);
		
		
		
	}
	
	void salary2() {
		
		
		System.out.println(name+" is earning "+salary+"$");
		
	}
	
	void salary2(int jj) {
		
		System.out.println(name+"'s Salary has been upgraded to "+jj+"$ ");
		
	}
}
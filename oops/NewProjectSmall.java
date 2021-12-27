package oops;

import java.util.Scanner;

// Banking Management System
public class NewProjectSmall {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		//char y = sc.next().charAt(0);
		
		Bank acc1 = new Bank("Saksham","100A");
		acc1.Welcome();
		acc1.Menu();
		acc1.GOg();
		
		
	}
	

}

class Bank{
	int balance;
	int prevtrans;
	String name;
	String accountid;
	
	
	
	
	Bank(String cname, String account){
		
		name = cname;
		accountid = account;
		
	}
	void Credit(int amount) {
		
		if (amount!=0) {
		balance += amount;
		prevtrans=amount;
		}
		
		
		
	}
	void Withdraw(int amount) {
		if (amount!=0) {
			
			balance-=amount;
			prevtrans=-amount;
			
			
		}
		
		
	}
	
	void PreviousTransaction() {
		
		if (prevtrans>0) {
			
			System.out.println("CREDITED:"+prevtrans);
			
		}
		else if(prevtrans<0) {
			
			System.out.println("WITHDRAWN:"+Math.abs(prevtrans));
		} else {
			System.out.println("NO PREVIOUS TRANSACTION!");
		}
	}
	void Welcome() {
		
		System.out.println("Welcome "+name);
		System.out.println("Your Account ID is "+accountid);
		System.out.println("\n");
		
		
	}
	void Menu() {
		
		System.out.println("A) Check Balance");
		System.out.println("B) Add Money to your Account");
		System.out.println("C) Withdraw Money from your Account");
		System.out.println("D) Check the last transaction");
		System.out.println("E) Exit");
		
	}
	void GOg() {
		char option = 'O';
		do {
			System.out.println("====================================================");
			System.out.print("Enter one option:");
			Scanner sc = new Scanner(System.in);
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			
			case('A'):
				System.out.println("------------------------------------------------");
				System.out.println("Balance is "+balance);
				System.out.println("------------------------------------------------");
				Menu();
				break;
			case('B'):
				System.out.println("------------------------------------------------");
				System.out.print("Enter the amount of money you want to add:");
				int u = sc.nextInt();
				Credit(u);
				System.out.println("INR "+u+" has been successfully added!");
				System.out.println("------------------------------------------------");
				Menu();
				break;
			case('C'):
				System.out.println("------------------------------------------------");
				System.out.print("Enter the money you want to withdraw:");
				int k = sc.nextInt();
				Withdraw(k);
				System.out.println("INR "+k+" has been withdrawn!");
				System.out.println("------------------------------------------------");
				Menu();
				break;
			case('D'):
				System.out.println("------------------------------------------------");
				PreviousTransaction();
				System.out.println("------------------------------------------------");
				Menu();
				break;
				
			case('E'):
				
				break;
				
				
			default:
				System.out.println("Invalid Input!");
				Menu();
				break;
			}
			
			
			
			
		}while(option!='E');
			
		System.out.println("Thank you!");	
		
			
		}
}
		
	
	
	
	



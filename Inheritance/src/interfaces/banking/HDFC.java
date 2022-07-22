package interfaces.banking;

import java.util.*;

public class HDFC implements ReserveBankOfIndia {

	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.display();
		obj.recurringDeposit();
		
		
		

	}

	public void recurringDeposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amnt=sc.nextInt();
		System.out.println("Enter the Period");
		int n=sc.nextInt();
		double Interest=amnt*n*RATE;
		System.out.println("Interest rate for the deposited amount :"+Interest);
		
	}

	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		char name=sc.next().charAt(0);
		System.out.println("Enter your account number");
		int acct=sc.nextInt();
		
	}

}

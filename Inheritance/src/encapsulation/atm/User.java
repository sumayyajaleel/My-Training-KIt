package encapsulation.atm;
import java.util.*;
public class User {
	int amnt;
	public void print()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the withdrawal amount :");
	amnt=sc.nextInt();
		
	}

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setPin(1001);
		Bank obj1=new Bank();
		obj1.setPin(1234);
		Bank obj2=new Bank();
		obj2.setPin(1212);
		int saveGetPin=obj.getPin();
		int saveGetPin1=obj1.getPin();
		int saveGetPin2=obj2.getPin();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pin Number : ");
		int pinNumber=sc.nextInt();
		if(pinNumber==saveGetPin||pinNumber==saveGetPin1||pinNumber==saveGetPin2)
		{
			System.out.println("Valid Pin");
			User obj3=new User();
			obj3.print();
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}

}

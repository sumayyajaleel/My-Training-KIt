package interfaces.progarm;

import java.util.Scanner;

public class InterfaceClass implements InterfaceExample3 {

	public static void main(String[] args) {
		InterfaceClass obj=new InterfaceClass();
		obj.hello();
		obj.num();
		

	}

	@Override
	public void hello() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password");
		int pass=sc.nextInt();
		
	}

	@Override
	public int num() {
		System.out.println("Password :"+PASS);
		return 0;
	}

}

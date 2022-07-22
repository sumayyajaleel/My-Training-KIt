package abstraction.salary;
import java.util.*;
public class FullTimeEmployee extends Employee {
	public final int HR=8;


	public static void main(String[] args) {
		FullTimeEmployee obj=new FullTimeEmployee();
		obj.calculateSalary();
	}


	@Override
	public void calculateSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int sal=sc.nextInt();
		int salary=sal*HR;
		System.out.println("Salary for 8hrs is "+salary);
	}

}

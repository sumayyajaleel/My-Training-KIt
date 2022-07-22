package EmployeeSalary;

import java.util.*;

public class GetSalaryDetails {
	int basicPay, deductionAmount,bonus;
	public void enterDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Pay");
		 basicPay=sc.nextInt();
		System.out.println("Enter the Deduction Amount");
		 deductionAmount=sc.nextInt();
		System.out.println("Enter the Bonus");
		 bonus=sc.nextInt();
	}

}

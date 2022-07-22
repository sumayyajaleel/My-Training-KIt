package EmployeeSalary;

public class CalculateDeductables extends GetSalaryDetails{
	public double hra,pf;
	public void calculateHraPf()
	{
	
		this.hra=(0.05)*basicPay;
		this.pf=(0.2)*basicPay;
		
	}
}

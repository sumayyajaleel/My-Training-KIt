package EmployeeSalary;

public class TotalSalary extends CalculateDeductables {
	public double totalSalary;
	public void calculateTotalSalary()
	{
		
		this.totalSalary=basicPay+hra-pf-deductionAmount+bonus;
		
		

	}
	public void displaySalarySlip()
	{
		System.out.println("***SALARY SLIP***");
		System.out.println("Basic Pay :"+basicPay);
		System.out.println("Deduction :" +deductionAmount);
		System.out.println("HRA :"+hra);
		System.out.println("PF :"+pf);
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+totalSalary);
	}
	
	public static void main(String[] args) {
		TotalSalary obj1=new TotalSalary();
		obj1.enterDetails();
		obj1.calculateHraPf();
		obj1.calculateTotalSalary();
		obj1.displaySalarySlip();
		
	}
}

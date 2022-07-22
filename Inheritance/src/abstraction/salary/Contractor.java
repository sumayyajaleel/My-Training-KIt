package abstraction.salary;
import java.util.Scanner;
public class Contractor extends Employee {
	
		public static void main(String[] args) {
			Employee obj1=new Contractor();
			obj1.calculateSalary();
			obj1.display();
			
		}

		@Override
		public void calculateSalary() {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the amount");
			int amnt=sc.nextInt();
			System.out.println("Enter the Hour");
			int hr=sc.nextInt();
			int salary=amnt*hr;
			System.out.println("Total Salary: " +salary);
			
			
		}
		
			
		

	}

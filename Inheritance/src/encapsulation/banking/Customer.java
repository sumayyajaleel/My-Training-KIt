package encapsulation.banking;

public class Customer {

	public static void main(String[] args) {
		ParentBank obj=new ParentBank();
		obj.setMoney(5000);
		obj.setCustomerId(123);
		obj.calculate();
		float total=obj.getMoney();
		
		System.out.println("Customer Id is :"+obj.getCustomerId());
		System.out.println("Total Balance is :"+total);
		
		

	}

}

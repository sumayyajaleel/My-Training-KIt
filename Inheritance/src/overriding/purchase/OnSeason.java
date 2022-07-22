package overriding.purchase;

public class OnSeason {


	public void discount(int amnt)
	{
	double disc=0.4d;
	disc=amnt*disc;
	double total=amnt-disc;
	System.out.println("Bill amount : "+amnt);
	System.out.println("Discount amount is : "+disc);
	System.out.println("Bill amount after discount is : "+total);
	
	}
	
}

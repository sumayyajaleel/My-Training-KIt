package overriding.purchase;
import java.util.*;
public class OffSeason extends OnSeason{
	
	public void discount(int amnt)
	{
		
		double disc=0.15;
		disc=amnt*disc;
		double balance=amnt-disc;
	
		System.out.println("Bill amount : "+amnt);
		System.out.println("Discount amount is : "+disc);
		System.out.println("Bill amount after discount is : "+balance);
	
	}
	public void display(int opt)
	{
		if(opt==1)
		{
		discount(6000);
		}
		else if(opt==2)
		{
			super.discount(2000);
		}
		else
		{
			System.out.println("Invalid Option");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Seasonal discount option" +"\n1.OnSeason" + "\n2.OffSeason");
		int option=sc.nextInt();
		OffSeason obj=new OffSeason();
		obj.display(option);
	
		
		

	}

}

package polymorphism;

public class Parent {
	public int operation(int num1,int num2)
	{
		int sum;
		sum=num1+num2;
		System.out.println("Sum is : "+sum);
		return sum;
	}
public void display()
{
	System.out.println("Parent Class");
}
}

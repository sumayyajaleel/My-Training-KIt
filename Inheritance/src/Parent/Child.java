package Parent;

public class Child extends Hello {
	public void print()
	{
		System.out.println("Inheritance");
	}
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.display();
		obj.print();
	}
	

}

	


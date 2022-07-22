package multilevel.inheritance;

public class Child extends Parent {
	public void print()
	{
		num+=10;
		System.out.println("Total Number:"+num);
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display(40);
		obj.print();
	
	
	}

}

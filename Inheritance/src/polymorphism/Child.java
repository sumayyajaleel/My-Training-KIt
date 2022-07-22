package polymorphism;

public class Child extends Parent {
	public int operation(int num1,int num2)
	{
		int sub;
		sub=num1-num2;
		System.out.println("Sub is : "+sub);
		super.operation(12,3);
		return sub;
	}
	public void print()
	{
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.print();
		obj.operation(50, 16);
		
		Parent obj1=new Child();
		obj1.display();
		obj1.operation(60,20);
		
	}

}

package multilevel.inheritance;

public class Child2 extends Parent {
	public void result()
	{
		num++;
		System.out.println("Output is:"+num);
	}


	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.display(40);
		
		obj.result();

	}

}

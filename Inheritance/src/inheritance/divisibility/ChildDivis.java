package inheritance.divisibility;

public class ChildDivis extends ParentAdd {
	int num,divis;
	
public int addition()
{
	int num=super.addition();
	divis=num%10;
	if(divis==0)
	{
		System.out.println(num+ " :is divisible by 10");
		return 0;
	}	
		else
		{
			System.out.println(num+ " :is not divisible by 10");
			return 0;
		}
	
}

	public static void main(String[] args) {
		ChildDivis obj=new ChildDivis();
		obj.addition();
		

	}

}

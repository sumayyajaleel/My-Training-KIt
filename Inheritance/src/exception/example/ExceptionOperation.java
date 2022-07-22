package exception.example;
import java.io.IOException;
public class ExceptionOperation {
	public void operation(int n1,int n2) throws IOException
	{
		if(n1>n2)
		{
			throw new IOException();
			
		}

	}
	public void display()
	{
		try
		{
			operation(5,3);
		}
		catch(Exception e)
		{
			System.out.println("n1>n2");
		}
	}
	

	public static void main(String[] args) {
		ExceptionOperation obj=new ExceptionOperation();
		//obj.operation(2,3);
		obj.display();

	}

}

package arraylist.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {
	

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("car");
		s.add("bus");
		s.add("bike");
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		s.remove(1);
		System.out.println(s);
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
		for(String e:s)
		{
			System.out.println(e);
		}
		s.clear();
		System.out.println(s);
	
		

	}

}

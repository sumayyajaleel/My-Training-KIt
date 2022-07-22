package student.details;

public class FullDetails {

	public static void main(String[] args) {
		
		Student obj1=new Student();
		obj1.setStudname("Sumayya");
		obj1.setRollnum(26);
		Address obj=new Address();
		obj.setHousenum(54);
		obj.setPlace("kollam");
		obj.setPinNum(691005);
		obj.setStudent(obj1);
		obj.display();

	}

}

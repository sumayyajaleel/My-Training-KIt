package student.details;

public class Address {
	private int houseNum;
	private String place;
	private int pinNum;
	private Student student;
	
	public int getHouseNum() {
		return houseNum;
	}
	public void setHousenum(int housenum) {
		this.houseNum = housenum;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPinNum() {
		return pinNum;
	}
	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public  void  display()
	{
		System.out.println("Student Class Details");
		System.out.println("Student Name :"+student.getStudname());
		System.out.println("Student Roll Number :"+student.getRollnum());
		System.out.println("Student Address Details");
		System.out.println("House Number :"+getHouseNum());
		System.out.println("Place/City :"+getPlace());
		System.out.println("Pin Number :"+getPinNum());
		
	}
	
	

}

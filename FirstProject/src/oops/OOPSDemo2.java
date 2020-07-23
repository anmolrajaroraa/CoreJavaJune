package oops;

import java.util.ArrayList;

// Is-A -> SavingsAccount is a Account (inheritance)
// Has-A -> Student has a Address, has a subject (aggregation) 

class Student2{
	private short id;   
	private String name;  
	private String courseName; 
	private byte courseDuration;
	private Address address;
	private ArrayList<Subject> subjects = new ArrayList<>();
	final static String COLLEGE_NAME = "XYZ Institute of Tech"; 
	
	Student2(int id, String name) {
		this.id = (short) id;
		this.name = name;
	}
	
	Student2(int id, String name, String courseName, int courseDuration) {
		this(id, name);
		this.courseName = courseName;
		this.courseDuration = (byte) courseDuration;
	}

	
	void setName(String name) {
		if(name != null && name != "") this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		if(courseName != null && courseName != "") this.courseName = courseName;
	}

	public byte getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(byte courseDuration) {
		if(courseDuration > 0) this.courseDuration = courseDuration;
	} 

	public short getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ",\naddress=" + address + ",\nsubjects=" + subjects + "]";
	}

}

public class OOPSDemo2 {
	
	public static void main(String[] args) {

		Student2 student = new Student2(101, "X Æ A-12", "BCA", 3);
		student.setName("Tommy");
		
		Address address = new Address(9, "Rohini", "Delhi", 110085, "Near mall");
		student.setAddress(address);
		
		Subject subject = new Subject("Java", "Rhythm", 50, 75);
		student.getSubjects().add(subject);
		
		subject = new Subject("C++", "Shalu", 90, 100);
		student.getSubjects().add(subject);
		
		System.out.println(student);
		
		Dad dad = new Dad();
		dad.luxuryCar();
		String abc = dad.propertyValue;
		
	}

}

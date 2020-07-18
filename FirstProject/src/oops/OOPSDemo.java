package oops;

import java.util.Arrays;

class Student{
	short id;   // -> 2  // class member, class variable, instance variables
	String name;  // -> 20
	String courseName; // -> 10
	byte courseDuration; // -> 1
	byte marksObtained[];  // -> 5
	final static String COLLEGE_NAME = "XYZ Institute of Tech"; // -> 40    1 object -> 38 bytes
	// static says I will get binded to the class
	// static will be loaded in memory when class is loaded
	// static is only created once and will be shared by all the objects
	// final variable should always be written in capital/block letters
	// DRY - Don't Repeat Yourself
	
	// setter
	void setMarks(byte[] marksObtained) {
		this.marksObtained = marksObtained;
	}
	
	// constructor has the same name as the class
	// constructor is never going to have any return type (even void shouldn't be written)
	// constructor is used to initialize critical member variables
	// it is called automatically when we create a new object
	
	// constructor
	Student(int id, String name) {
		this.id = (short) id;
		this.name = name;
	}
	
	Student(int id, String name, String courseName, int courseDuration) {
		this(id, name);
		this.courseName = courseName;
		this.courseDuration = (byte) courseDuration;
	}
	
	void takeInput(int id, String name, String courseName, int courseDuration) {
		this.id = (short) id;
		this.name = name;
		this.courseName = courseName;
		this.courseDuration = (byte) courseDuration;
//		System.out.println("student is " + this);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", marksObtained=" + Arrays.toString(marksObtained) + "]";
	}
	
//	void showDetails() {
//		System.out.println("Student id is " + id);
//		System.out.println("Student name is " + name);
//		System.out.println("Student courseName is " + courseName);
//		System.out.println("Student courseDuration is " + courseDuration);
//		System.out.print("Student marksObtained is {");
//		for(byte marks: marksObtained) {
//			System.out.print(marks + ", ");
//		}
//		System.out.println("}");
//	}
	
	
	
//	void takeInput(int s_id, String s_name, String course, int duration, byte[] marks) {
//		id = (short) s_id;
//		name = s_name;
//		courseName = course;
//		courseDuration = (byte) duration;
//		marksObtained = marks;
//	}
}

// method = function
// fn in class

class Teacher{
	void add() {
		System.out.println("Teacher added...\nThis is a new line\nThis is another line");
	}
}

public class OOPSDemo {
	
	public static void main(String[] args) {
//		Student.collegeName = null;
		
		Student student = new Student(101, "Ram", "BTech", 4);
//		System.out.println(student);
//		System.out.println("Studen1 going to call takeinput()");
//		student.takeInput(101, "Ram", "BTech", 4);
		student.marksObtained = new byte[] {50,60,70,80,90};
//		student.setMarks(new byte[] {50,60,70,80,90});
//		student.showDetails();
		System.out.println(student);
//		
		Student student2 = new Student(102, "Shyam");
		System.out.println("Studen2 going to call takeinput()");
		student2.takeInput(102, "Shyam", "BTech", 4);
//		student2.showDetails();
		System.out.println(student2);
		
//		Student student3 = new Student(103, "Sita", null, 3);
		Student student3 = new Student(0, "");
		
		// wait for 10 mins
		
		student3.courseDuration = 3;
		System.out.println("Studen3 going to call takeinput()");
//		student3.takeInput(103, "Sita", "BCA", 3);
//		student3.showDetails();
		System.out.println(student3.toString());
		
//		System.out.println("Student 1 is " + student);
//		System.out.println("Student 2 is " + student2);
//		System.out.println("Student 3 is " + student3);
		
//		student.id = 101;
//		student.name = "Ram";
//		student.courseName = "BTech";
//		student.courseDuration = 4;
//		student.marksObtained = new byte[] {50,60,70,80,99};
//		Student.collegeName = "Worst college";
//		student.collegeName = "XYZ Institute of Tech";
		
//		Student student2 = new Student();
//		student2.id = 102;
//		student2.name = "Shyam";
//		student2.courseName = "BTech";
//		student2.courseDuration = 4;
//		student2.marksObtained = new byte[] {50,60,70,80,89};
////		student2.collegeName = "XYZ Institute of Tech";
//		
//		Student student3 = new Student();
//		student3.id = 103;
//		student3.name = "Sita";
//		student3.courseName = "BCA";
//		student3.courseDuration = 3;
//		student3.marksObtained = new byte[] {50,60,70,80,9};
//		student3.collegeName = "XYZ Institute of Tech";
		
		System.out.println(Student.COLLEGE_NAME);
//		System.out.println(student.collegeName);
//		System.out.println(student2.collegeName);
//		System.out.println(student3.collegeName);
		
//		ArrayList<Object> al = new ArrayList<>();
//		al.add(100);
//		al.add("Ram");  
//		int marks[] = {50,60,70,80,90};
//		al.add(marks);
//		al.add(70);
//		al.add(19);
//		
//		ArrayList<Object> al2 = new ArrayList<>();
//		al2.add(101);
//		
//		Student student = new Student();
//		
//		int arr[] = new int[10];
	}

}

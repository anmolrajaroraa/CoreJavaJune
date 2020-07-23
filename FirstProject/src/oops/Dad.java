package oops;

public class Dad {
	protected String propertyValue = "10 Crores";
	protected void luxuryCar() {
		System.out.println("Jaguar XE");
	}
	public void getDonation() {
		System.out.println("5k rupees");
	}
	
	public static void main(String[] args) {
		System.out.println("I am dad!");
	}
}

class Dad2 {
	protected String propertyValue = "10 Crores";
	protected void luxuryCar() {
		System.out.println("Jaguar XE");
	}
	public void getDonation() {
		System.out.println("5k rupees");
	}
	
	public static void main(String[] args) {
		System.out.println("I am dad!");
	}
}

class Child extends Dad{
	
	void useDadCar() {
		luxuryCar();
	}
	
	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.luxuryCar();
		String propertyInherited = dad.propertyValue;
	}
}

class ChildFriend{
	public static void main(String[] args) {
		Dad dad = new Dad();
		dad.luxuryCar();
		String propertyInherited = dad.propertyValue;
		System.out.println("CHild friend");
	}
}


// default keyword is used only with interfaces
// if you want to specify default access modifier then you don't need to specify anything

//1. Private -> Only in same class
//2. Default (no keyword used) -> Same as private + all classes in same package
//3. Protected -> Same as private and default + all the child classes (extends) in any package
//4. Public -> Same as above 3 + universal access in the complete project
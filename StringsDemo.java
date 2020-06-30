class Employee{
	int a = 10;
}

class StringsDemo{
	public static void main(String[] args){
		// a collection of characters but it's not same as character array
		
		// string literal way -> 1 or 0 objects
		// string creation using new keyword -> 2 or 1

		String s0 = new String("Ram");  // two objects will be created
		// s0 will point heap object coz new has more precedence
		String s = "Ram";  // 99   // no object will be created
		// s will start pointing to the pool object
		String s2 = "Ramaaammm"; // s2 will also point to the pool object
		String s3 = new String("Raman");
		// a new object will be created in heap
		// and will point to that heap object
		char[] c = {'R', 'a', 'm'};
		c[0] = 'm';
		// s[0] = "m";   // string is immutable
		// String s2 = "Raman"; // 98
		// s += "a";  // if you try to modify any string a new object will be created with new value
		System.out.println("s is " + s);

		System.out.println(s == s2);
		System.out.println(s == s3); // compare memory location
		System.out.println(s.equals(s2)); // compare actual values of string
		System.out.println(s.equals(s3));

		// string is an object, you should not treat it as a character array
		// s[0] - this is illegal
		System.out.println("First character is " + s2.charAt(0));
		char[] sArr = s3.toCharArray();
		System.out.println(sArr[0]);

		String newString = s2.replace("am", "rr");
		System.out.println(newString);

		String query = "select * from products";  // all products are fetched
		// I want to see mobiles
		query += "where product_category = 'mobiles'";
		// I want to see mobiles under 25,000
		query += "and price <= 25000";

		String welcomeMessage = "Welcome " + user;

		// StringBuffer or StringBuilder;


		// Employee obj1 = new Employee();
		// Employee obj2 = new Employee();
		// System.out.println(obj1 == obj2);
	}
}
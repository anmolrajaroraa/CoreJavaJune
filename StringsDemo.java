class Employee{
	int a = 10;
}

class StringsDemo{
	public static void main(String[] args){
		// a collection of characters but it's not same as character array
		String s = "Ram";  // 99
		char[] c = {'R', 'a', 'm'};
		c[0] = 'm';
		s[0] = "m";   // string is immutable
		// String s2 = "Raman"; // 98
		String s2 = "Ram";
		s += "a";  // if you try to modify any string a new object will be created with new value
		System.out.println("s is " + s);
		System.out.println(s == s2);

		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		System.out.println(obj1 == obj2);
	}
}
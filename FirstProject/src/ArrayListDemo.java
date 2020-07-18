import java.util.ArrayList;
import java.util.Iterator;

import questions.Solution5;

public class ArrayListDemo {
	
	static void something(int ...x) {
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(Integer.valueOf(10));  // autoboxing - automatic conversion from primitive to object
		al.add(Byte.valueOf( (byte) 10) );
		al.add((byte)10);
		al.add(10.5);
		al.add(100.200f);
		al.add(1000000000000l);
		al.add('c');
		al.add("ten");
		al.add(true);
		al.add(new int[10]);
		al.add(new ArrayList<>());
		
		System.out.println(al);
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		Iterator<Object> obj = al.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		al.forEach(element -> System.out.println("Element is " + element));  
		// class implements interface, override methods -> object -> fn call
		
		
		// Arraylist is nothing but an array that can scale its size
//		al[0];  // error - square brackets not supported with object
		// by default arraylist only stores objects
		
		char[] arr2 = new char[10];
		arr2[0] = 'a';
		
//		String s = new String("Ram");
//		s[0] = 'a';
		
		something();

//		int ...x = {};
		
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("English");
		subjects.add("French");
		subjects.add("Computer Science");
		subjects.add("Chemistry");
		subjects.add("Physics");
		subjects.add(new String("Python"));
		
		subjects.add(3, "PhD");  // shifts elements ahead
//		subjects.add(4, "ED");
		subjects.set(4, "ED");  // i'll overwrite the old element
		
		
		System.out.println("French is at index - " + subjects.indexOf("French"));
		System.out.println("Subject at index 2 is " + subjects.get(2));
		subjects.remove("PhD");
		subjects.remove(2);
		
		System.out.println(subjects);
		
		ArrayList<Integer> newAl = new ArrayList<>();
		newAl.add(10);  //autoboxing
		newAl.add(20);
		newAl.add(30);
		newAl.add(40);
		newAl.add(50);
		newAl.add(1);
		newAl.add(2);
		newAl.add(3);
		newAl.add(4);
		newAl.add(5);
		
		newAl.remove(10);
		newAl.remove( newAl.indexOf(10) );
		
		newAl.remove(Integer.valueOf(10));
		
//		int a = 10;  -> index , primitive
//		Integer i = Integer.valueOf(10);  -> Object , object of wrapper class
		
		System.out.println(newAl);
		
		ArrayList<Byte> newAl2 = new ArrayList<>();
		ArrayList<Short> newAl3 = new ArrayList<>();
		ArrayList<Long> newAl4 = new ArrayList<>();
		ArrayList<Boolean> newAl5 = new ArrayList<>();
		ArrayList<Character> newAl6 = new ArrayList<>();
		ArrayList<Float> newAl7 = new ArrayList<>();
		ArrayList<Double> newAl8 = new ArrayList<>();
		
	}

}

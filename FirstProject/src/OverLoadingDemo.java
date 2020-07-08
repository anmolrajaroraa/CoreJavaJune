
public class OverLoadingDemo {

//	static void add() {
//		System.out.println(0);
//	}
//	
	static void add(int a) {
		System.out.println(a);
	}
//	static int add(int a) {
//		System.out.println(a);
//	}
//	
	static String add(double a) {
		System.out.println(a + 10);
		return null;
	}
//	
	static void add(int a, int b) {
		System.out.println(a + b);
	}
//	
//	static void add(double a, double b) {
//		System.out.println(a + b + 10);
//	}
//	
//	static void add(int a, int b, int c) {
//		System.out.println(a + b + c);
//	}
//	
//	static void add(int a, int b, int c, int d) {
//		System.out.println(a + b + c + d);
//	}
	
	static void add(int ...args) {  // varargs -> you can supply variable arguments
//		System.out.println(args);
		
		int sum = 0;
//		
//		for(int i = 0; i < args.length; i++) {
//			sum += args[i];
//		}
		
		for( int element : args ) {     // enhanced for loop
			sum += element;
		}
		
		System.out.println("Sum is " + sum);
	}
	
	// Overloading - name should be same (number of args or type of args can change)
	// overloading - name same but return type can change
	
	public static void main(String[] args) {
		
		add();
		add(10);
//		add(10.0);
		add(10,20);
//		add(10.0, 20.0);
		add(10,20,30);
		add(10,20,30,40);
		add(10,20,30,40,50);
//		int[] arr = {10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,100};
//		add(arr);
//		System.out.println("Arr is " + arr);

	}

}

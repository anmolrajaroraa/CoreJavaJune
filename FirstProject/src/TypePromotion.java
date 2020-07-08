
public class TypePromotion {
	
	static void testTypePromotion(int x) {
		System.out.println("int");
	}
	
//	static void testTypePromotion(Integer x) {
//		System.out.println("Integer");
//	}
	
//	static void testTypePromotion(int ...x) {
//		System.out.println("varargs ...");
//	}
	
//	static void testTypePromotion(long x) {
//		System.out.println("long");
//	}
	
//	static void testTypePromotion(double x) {
//		System.out.println("double" + x);
//	}
	
	static void testTypePromotion(byte x) {
		System.out.println("byte");
	}
	
	static void testTypePromotion(short x) {
		System.out.println("short");
	}

	public static void main(String[] args) {
		
		testTypePromotion(100);  //-> int
		
		byte a = 10;
		
		testTypePromotion(a);
		
		/*
		 * Type Promotion
		 * 0. Default - int (primitive)
		 * 1. Widening - bigger data type - primitive - byte -> short -> int -> long -> float-> double
		 * 2. Wrapper class
		 * 3. varargs
		 * 4. won't go towards smaller data types (explicit type casting required)
		 * 
		 */
		
	}

}

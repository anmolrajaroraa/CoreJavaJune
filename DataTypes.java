class DataTypes{
	// String []args
	// String args[]
	// String ...args -> varargs -> internally it's an array only
	public static void main(String[] args){

		// primitive data types
		// byte, short, int, long, char, float, double, boolean
		// primitive means that the variables is a container
		// and the value on the right side is directly stored in it
		
		// reference data types
		// String, BigInteger, BigDecimal, objects
		// class - custom type made by us
		
		// wrapper classes - reference data types
		// Byte, Short, Integer, Long, Float, Double, Character, Boolean

		byte a = (byte)131;
		// l signifies to java that this particular number is greater
		// than limit of int so you should treat it as long
		int aa = (int)3270000000l;
		// by default any integer in java is treated as int type
		// byte takes 1 byte memory space
		// int consumes 4 bytes memory space - 2 ^ 32 => -2000000000 to 2 trillion
		// short consumes 2 bytes memory space - 2 ^ 16 => 65536
		// short range is => -32768 to 32767
		byte b = (byte)-130;   // type casting - forcefully convert the type of a value
		// type casting - possibly lossy conversion
		// short c = -130;
		long d = -15000000000000l;
		// 20000000000000
		short e = (short)32768;
		// int e = 50000;
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		System.out.println(aa);
		System.out.println("d is " + d);
		System.out.println("byte min value is " + Byte.MIN_VALUE);
		System.out.println("byte max value is " + Byte.MAX_VALUE);
		System.out.println("short min value is " + Short.MIN_VALUE);
		System.out.println("short max value is " + Short.MAX_VALUE);
		System.out.println("int min value is " + Integer.MIN_VALUE);
		System.out.println("int max value is " + Integer.MAX_VALUE);
		System.out.println("long min value is " + Long.MIN_VALUE);
		System.out.println("long max value is " + Long.MAX_VALUE);
	}
}
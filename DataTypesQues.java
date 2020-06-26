// import java.lang.*;
import java.math.BigInteger;

class DataTypesQues{
	public static void main(String args[]){
		int a = 123;
		if( a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE ){
			System.out.println("Byte");
		}

		int i = (int)10.5;

		// By default every number having decimal point is treated as double
		double d = 10.5;
		System.out.println(d);
		// float f = (float)10.5;
		float f = 345676.53f;
		double dd = 9124345676.53;
		System.out.println("f is " + f);
		System.out.println("dd is " + dd);

		char c = '1'; // primitive
		char m = '®'; // consume 2 bytes of memory 
		char n = '≈'; // C/C++ consume 1 byte for char
		char o = 'Ω';
		char p = 'a';

		boolean b = true;
		b = false;

		// String - reference type
		// char - primitive
		// char[] - reference type in java, primitive
		// wrapper classes
		// 2 utility classes - BigInteger, BigDecimal

		// String gdp = "123456789012345678901234567890";
		// String loan = "12345678901234567890123456789";
		// String netValue = gdp - loan;
		// System.out.println(netValue);

		// netValue[last] = gdp[last] - loan[index];
		// netValue[second last] = gdp[second last] - loan[second index];

		BigInteger num1 = new BigInteger("123456789012345678901234567890");
		BigInteger num2 = new BigInteger("12345678901234567890123456789");
		System.out.println("num1 + num2 is " + num1.add(num2));

		// void print(char message){

		// }
		// print();
	}
}
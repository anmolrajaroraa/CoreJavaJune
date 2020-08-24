import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws IOException {
//		try-catch block, try-catch-finally block, try-multicatch-finally block, try-finally block, try-with-resources
		// we want to catch all exceptions, if any, to provide some way of managing the exceptions and allow
		// the program to continue without stopping abruptly
		
		Scanner scanner = new Scanner(System.in);
		FileInputStream fin = null;
		
		try{
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println(num1/num2);
//			fin = new FileInputStream("employee.ser");
//			byte[] data = fin.readAllBytes();
//			System.out.println(Arrays.toString(data));  // exception
		}
//		catch(FileNotFoundException e) {
//			System.out.println("File with specified path doesn't exist");
//		}
		catch(InputMismatchException | NumberFormatException e) {
			System.out.println("Please enter only integers");
		}
//		catch(InputMismatchException e) {
////			e.printStackTrace();
//			System.out.println("Please enter only integers");
//		}
//		catch(NumberFormatException e) {
//			System.out.println("Please enter only integers");
//		}
		catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Divide by zero is not allowed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I will run always whter exception occurs or not");
//			fin.close();
		}
		
		System.out.println("If exception occurs before me, then I won't able to run");
		
		scanner.close();
	}

}

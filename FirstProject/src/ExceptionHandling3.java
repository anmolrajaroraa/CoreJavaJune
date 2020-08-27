import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {
	
	public static int correctPIN = 1234;
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void verifyPin() throws Exception{
		System.out.println("Please enter your PIN");
		int PIN = scanner.nextInt();
		if(correctPIN != PIN) {
			throw new InputMismatchException();  // raise custom exception
		}
		
	}
	
	public static void withdraw() throws Exception {
		verifyPin();
	}

	public static void main(String[] args) {
		try{
			withdraw();
		}
		catch(InputMismatchException | NumberFormatException e) {
			System.out.println("Please enter only integers");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

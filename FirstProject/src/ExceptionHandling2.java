import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		// try-with-resources
		try(
				Scanner scanner = new Scanner(System.in);
				FileInputStream fin = new FileInputStream("employee.ser");
		){
			
			scanner.nextInt();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		Scanner s = null;
		try {
			s = new Scanner(System.in);
			s.nextInt();
		}
		finally {
			s.close();
		}
	}

}

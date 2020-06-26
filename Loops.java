import java.util.Scanner;

class Loops{
	public static void main(String[] args){

		// for( start; stop; step; )
		for( int i = 0; i < 10; i++){

			// if( i == 5 ){
			// 	System.out.println("Going to skip a step");
			// 	continue;  // continue - continue to the next iteration
			// }

			if( i == 5){
				System.out.println("Going to terminate the loop");
				break;  // break the loop that it is direct parent to this statement
			}

			System.out.println(i);
		}

		// user is slow as compared to cpu so i am going to store your data in a buffer
		// and when you want to use that data then cpu will go and fetch it for you from the buffer
		Scanner scanner = new Scanner(System.in);
		// System.out.print("Please enter something: ");
		// int i = scanner.nextInt();
		// int i2 = scanner.nextInt();
		// int i3 = scanner.nextInt(); // it was waiting for me to enter some integer into the buffer
		// System.out.println("Number fetched from buffer is " + i);
		// System.out.println("i2 is " + i2);
		// System.out.println("i3 is " + i3);

		// int i = scanner.nextInt();
		// char c = scanner.next().charAt(0);
		// fetch a string from buffer and give me the character sitting
		// long l = scanner.nextLong();
		// System.out.println("i is " + i);
		// System.out.println("c is " + c);
		// System.out.println("l is " + l);

		// String s1 = scanner.next();
		// String s2 = scanner.nextLine();

		// System.out.println("s1 is [" + s1 + "]");
		// System.out.println("s2 is [" + s2 + "]");		

		System.out.print("Enter id: ");
		int id = scanner.nextInt();  
		System.out.println("id is [" + id + "]");

		scanner.nextLine();   

		System.out.print("Enter name: ");
		String name = scanner.nextLine(); 
		System.out.println("name is [" + name + "]");

		System.out.print("Enter designation: ");
		String designation = scanner.nextLine(); 
		System.out.println("designation is [" + designation + "]");

		System.out.print("Enter salary: ");
		int salary = scanner.nextInt();
		System.out.println("salary is [" + salary + "]");

		scanner.nextLine();

		System.out.print("Enter department: ");
		String department = scanner.nextLine();
		System.out.println("department is [" + department + "]");		

		// Buffer: 101
		// 10000		

		// string is an object, you cannot treat it as a character array
		// next() -> I will fetch string until I find a space or \n
		// nextLine() -> I will fetch string until I find a newline character

		// int a = 10;
		// a = 11;
		// int a = 11; // error

	}
}
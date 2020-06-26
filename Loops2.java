import java.util.Scanner;

class Loops2{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		// it will run until the condition becomes false
		// while(scanner.hasNextFloat()){

		// 	System.out.println("New iteration");

		// 	float j = scanner.nextFloat();
		// 	System.out.println("J is " + j);
		
		// }

		while(true){
			if(scanner.hasNextInt()){
				int j = scanner.nextInt();
				System.out.println("Number J is " + j);	
			}

			else if(scanner.hasNextBoolean()){
				boolean j = scanner.nextBoolean();
				System.out.println("Boolean J is " + j);	
			}

			else if(scanner.hasNext()){
				String j = scanner.next();
				System.out.println("String J is " + j);
			}
		}

	}
}
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day:");
		
//		int a = scanner.nextInt();
		String day = scanner.nextLine().toLowerCase();
		
		switch(day) {
		case "monday":
			System.out.println("Monday");
			break;
		case "tuesday":
			System.out.println("Tuesday");
			break;
		case "wednesday":
			System.out.println("Wednesday");
			break;
		case "sunday":
			System.out.println("Sunday");
			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
		default:
			System.out.println("Couldn't guess..");
		}
		
		System.out.println("What do you want to order...");
		
		String order = scanner.nextLine();
		
		switch(order) {
		
		case "burger":
			System.out.println("Please wait 5 mins for your burger...");
			break;
		case "soft drink":
			System.out.println("Do you want soft drink?");
			String choice = scanner.nextLine();
			if(choice.equals("yes")) {
				System.out.println("Ok, your soft drink is on its way...");
			}
			else {
				System.out.println("Thanks for ordering...");
			}
			break;
		case "momos":
			System.out.println("Please wait 5 mins for your momos...");
		case "mayo sauce":
			System.out.println("Do you want mayonnaise?");
			choice = scanner.nextLine();
			if(choice.equals("yes")) {
				System.out.println("Ok, your mayo sauce is also on its way...");
			}
			else {
				System.out.println("Thanks for ordering...");
			}
			break;
		default:
			System.out.println("Sorry, we don't serve that...");
		}
		
		scanner.close();
	}

}

package questions;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		// scanner
		// input - n - no of strings
		// 3
		// input - s - first string
		// always believe
		// [awy eiv][lasblee]
		
		// just do it
		// [js oi][utd t]
		
		// something wonderful
		// [smtigwnefl][oehn odru]
		
		// [even index characters here][odd index characters here]
		// a l w a y s _ b e l i  e  v  e
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of strings you want to test: ");
		int n = scanner.nextInt(); 
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			
			String str = scanner.nextLine();
			int length = str.length();
			char even[] = new char[length];
			char odd[] = new char[length];
			
			for(int j = 0; j < length; j++) {
				char c = str.charAt(j);
				if(j % 2 == 0) {
					even[j] = c;
				}
				else {
					odd[j] = c;
				}
			}
			
			System.out.println(even);
			System.out.println(odd);
			
		}
		
//		for(int i = 0; i < n; i++) {
//			
//			System.out.print("Enter a string: ");
//			String str = scanner.nextLine(); 
//			
//			System.out.print("[");
//			for(int j = 0; j < str.length(); j+=2) {
//				
//				char c = str.charAt(j);
//				System.out.print(c);
//				
//			}
//			System.out.print("]");
//			
//			System.out.print("[");
//			for(int j = 1; j < str.length(); j+=2) {
//				
//				char c = str.charAt(j);
//				System.out.print(c);
//				
//			}
//			System.out.print("]");
//			
//			System.out.println();
//			
//		}

	}

}
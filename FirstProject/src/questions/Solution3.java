package questions;

import java.util.ArrayList;

public class Solution3 {

	public static void main(String[] args) {
		
		int arr1[] = {1,4,6,18,19,3}; // -> one number from here
		int arr2[] = {4,5,3,6,8,2}; // -> one number from here
		
		int sum = 13;
		
		boolean isPairFound = false;
		
		ArrayList al = new ArrayList();  // dynamic array
		for(int i = 0; i < arr1.length; i++) {
			al.add( arr1[i] );
		}
		
		System.out.println("Arraylist is " + al);
		
		for(int i = 0; i < arr2.length; i++) {
			int number = arr2[i];
			if(al.contains(sum - number) == true) {
				isPairFound = true;
				System.out.println("Pair is - " + number + ", " + (sum - number));
				break;
			}
		}
		
		if(isPairFound == false) {
			System.out.println("No pair found...");
		}
		
	}

}

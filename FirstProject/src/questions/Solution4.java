package questions;

public class Solution4 {

	public static void main(String[] args) {
		 int arr[] = {9,9,9,9};
//		 int sum = 0;
//
//		 for(int i = 0; i < arr.length; i++) {
//			 
//			 int number = arr[i];
//			 
//			 sum += number * (int) Math.pow(10, arr.length - i - 1);
//			 
//		 }
//		 
//		 System.out.println(++sum);
		
//		 {1,0,0,0,0}
		 
		 
		int carry = 1;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			arr[i] = arr[i] + carry;
			carry = 0;
			
			if(arr[i] == 10) {
				arr[i] = 0;
				carry = 1;
			}
			
			if(carry == 0) {
				break;
			}
		}
		
		if(carry == 1) {
			arr = new int[  arr.length + 1 ];
			arr[0] = 1;
		}
		
		for(int element : arr) {
			System.out.print(element + ", ");
			//statement 2
			//statement 3
		}
		
	}

}

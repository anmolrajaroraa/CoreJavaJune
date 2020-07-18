package questions;

import java.util.HashMap;
import java.util.Scanner;

public class Solution6 {

	static String findOppositeSeat(int seatNo) {
		HashMap<Integer, Integer> seats = new HashMap<>();
		for(int i = 1, j = 12; i <=12; i++, j--) {
			seats.put(i, j);
		}
		
		String seatType[] = {"WS", "MS", "AS", "AS", "MS", "WS"};
		
//		System.out.println(seats);
		
		// s - a + b
		// seatNo - modulusBy12Result + valueFromHashmap
		
		int keyToBeSearched = seatNo % 12;
		
		if(keyToBeSearched == 0) keyToBeSearched = 12;
		
		int value = seats.get(keyToBeSearched);
		int oppositeSeat = seatNo - keyToBeSearched + value;
		
		String oppositeSeatType = keyToBeSearched <= 6 ? seatType[keyToBeSearched - 1] : seatType[value - 1];
		
		return oppositeSeat + " " + oppositeSeatType;
		
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int noOfSeats = scanner.nextInt();
		
		for(int i = 0; i < noOfSeats; i++) {
			int seatNo = scanner.nextInt();
			String result = findOppositeSeat(seatNo);
			System.out.println(result);
		}
		
		scanner.close();
		
	}

}

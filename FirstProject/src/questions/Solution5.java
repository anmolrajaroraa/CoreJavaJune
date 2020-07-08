package questions;

import java.util.HashMap;

public class Solution5 {
	
	public static char findFirstNonRepeatingCharacter(String s) {
		
		HashMap<Character, Integer> alphabetCount = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(alphabetCount.containsKey(c)) {
				int count = alphabetCount.get(c);
				count++;
				alphabetCount.put(c, count);
			}
			else {
				alphabetCount.put(c, 1);
			}
		}
		
		System.out.println(alphabetCount);
		
		for(char c : s.toCharArray()) {
			if(alphabetCount.get(c) == 1) {
				return c;
			}
		}
		
		return '_';
	}

	public static void main(String[] args) {

		String s = "afghjkl";
		
		System.out.println(findFirstNonRepeatingCharacter(s));
		
	}

}

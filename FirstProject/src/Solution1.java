public class Solution1 {
	
//	public static char findFirstNonRepeatingCharacter(String s) {
//		
//		for(int i = 0; i < s.length(); i++) {
////			System.out.println( s.charAt(i) );
//			
//			boolean isDuplicateFound = false;
//			char element = s.charAt(i);
//			
//			for(int j = 0; j < s.length(); j++) {
//				if( i != j && s.charAt(j) == element) {
//					
//					isDuplicateFound = true;
//					break;
//					
//				}
//			}
//			
//			if(isDuplicateFound == false) {
//				return element;
//			}
//			
//		}
//		
//		return '_';
//	}
	
//	public static char findFirstNonRepeatingCharacter(String s) {
//		
//		for(int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			
//			if(s.indexOf(c) == s.lastIndexOf(c)) {
//				return c;
//			}
//		}
//		
//		return '_';
//	}
	
	public static char findFirstNonRepeatingCharacter(String s) {
		
		int characterCount[] = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			int asciiCode = c;
			int index = asciiCode - 97;
			characterCount[index]++;
			
		}
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			int asciiCode = c;
			int index = asciiCode - 97;
			if(characterCount[index] == 1) {
				return c;
			}
			
		}
		
		/*
		 *  for(int i = 0; i < s.length(); i++) {
			 	characterCount[s.charAt(i) - 'a']++;
			}
			
			for(int i = 0; i < s.length(); i++) {
				if(characterCount[s.charAt(i) - 'a'] == 1) return s.charAt(i);
			}
		*/
		
//		a -> 97 - 97 -> 0
//		b -> 98 - 97 -> 1
//		z -> 122 - 97 -> 25
		
//		for(int i = 0; i < characterCount.length; i++) {
//			System.out.print(characterCount[i] + " ");
//		}
		
		return '_';
	}

	public static void main(String[] args) {
		
		// find first non-repeating character
		// atleast 1 character
		// a-z characters
		
		// aaabcccdeeef -> b
		// aabbccddeeff -> _
		
		String s = "tsrynjbdyikxknbdswwryi";
		
//		int ascii = '%';
//		System.out.println(ascii);
//		char c = 37;
//		System.out.println(c);
		
		char result = findFirstNonRepeatingCharacter(s);
		System.out.println(result);
		
		

	}

}


/*

s = "srynbdyikknbdswwryijcxt"

[0,2,0,2,0,0,0,0,2,0,2,0,0,2,0,0,0,2,2,0,0,0,2,0,3,0] -> _

[0,2,0,2,0,0,0,0,2,1,2,0,0,2,0,0,0,2,2,0,0,0,2,0,3,0] -> j

a, b, c, d, e, f, g, h, i













*/

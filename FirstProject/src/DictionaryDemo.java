import java.util.HashMap;

public class DictionaryDemo {
	
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
		
//		HashMap<String, Integer> phonebook = new HashMap<>();
//		phonebook.put("Ram", 123456890);
//		phonebook.put("Shyam", 123456789);
//		phonebook.put("Ram", 9999999);
//		
//		System.out.println("Ram's contact no is " + phonebook.get("Ram"));
//		System.out.println("Shyam's contact no is " + phonebook.get("Shyam"));

		String s = "ahhffsdfgghhfdas";
		
		System.out.println(findFirstNonRepeatingCharacter(s));
		
//		Employee employee = new Employee();
		
	}

}

//HashMap<Character, Integer>
//{
//	'a': 3,
//	'b': 1,
//	'c': 3,
//	'd': 1,
//	'e': 3,
//	'f': 1
//}

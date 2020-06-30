import java.util.HashMap;

public class DictionaryDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Ram", 123456890);
		phonebook.put("Shyam", 123456789);
		
		System.out.println("Ram's contact no is " + phonebook.get("Ram"));
		System.out.println("Shyam's contact no is " + phonebook.get("Shyam"));

	}

}

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		System.out.println(rb.getString("db"));
		System.out.println(rb.getString("userid"));
		System.out.println(rb.getString("pwd"));
		System.out.println(rb.getString("dbname"));
		System.out.println(rb.getString("host"));
		
		Locale locale = new Locale("pa", "IN");
		ResourceBundle rb2 = ResourceBundle.getBundle("messages", locale);
		String message = rb2.getString("greet");
		System.out.println(message);
//		messages_en_US
	}

}

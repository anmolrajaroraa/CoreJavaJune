
public class StringsDemo {

	public static void main(String[] args) {
		
		StringBuffer query = 
				new StringBuffer("select * from products");
		query.append("where price <= 25000");
		
		StringBuilder query2 = new StringBuilder();
		
		synchronized (query2) {
			
		}
		

	}

}

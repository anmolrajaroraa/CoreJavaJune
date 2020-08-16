package oops;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) {
		
		String fileName = "employee.ser";
		Employee employee = new Employee();
		employee.setId(100);
		employee.setName("Ram");
		employee.setSalary(50000);
		employee.setPassword("ram1234");
		employee.setDesignation("Staff SWE");
		
		try {
			SerializationUtil.serialize(employee, fileName);
			System.out.println("Serialization done..");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		Employee newEmployee = null;
		
		try {
			newEmployee = (Employee) SerializationUtil.deserialize(fileName);
		} 
		catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Original employee object : " + employee);
		System.out.println("Desreialized employee object : " + newEmployee);
		

	}

}

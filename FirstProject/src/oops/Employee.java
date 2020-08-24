package oops;

import java.io.Serializable;

public class Employee{
	
	private String name;
	private int id;
	private int salary;
	private transient String password;
	public static String COMPANY_NAME = "XYZ, Inc.";
	private String designation;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + 
				", password=" + password + ", designation=" + designation + 
				", companyName=" + COMPANY_NAME + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}


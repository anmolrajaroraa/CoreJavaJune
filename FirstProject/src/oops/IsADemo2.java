package oops;

import java.util.Scanner;

class EmployeeDetails{
	String department;
	String managerName;
	String projectName;
	int floor;
}

class EmployeeDetailsPlus extends EmployeeDetails{
	int incentives;
}

class AA{
	int aa;
	public EmployeeDetails getDetails() {
		EmployeeDetails details = new EmployeeDetails();
		details.department ="IT";
		details.managerName = "Ram Kumar";
		details.projectName = "NewProject";
		details.floor = 9;
		return details;
	}
}

class BB extends AA{
	int bb;
	@Override
	public EmployeeDetailsPlus getDetails() {
		EmployeeDetailsPlus details = new EmployeeDetailsPlus();
		details.department ="IT";
		details.managerName = "Ram Kumar";
		details.projectName = "NewProject";
		details.floor = 9;
		details.incentives = 10000;
		return details;
	}
}

public class IsADemo2 {

	public static void main(String[] args) {
		BB obj = new BB();
		Scanner scanner = new Scanner(System.in);
		System.out.println();
	}

}

// 2 thumb rules for overriding
// 1. Signature should be same - but it can be changed if it is covariant
// 2. Weaker access rule - you can keep same or increase visibility
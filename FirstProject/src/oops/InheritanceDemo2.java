package oops;

abstract class Account extends Object{
	int accountNo;
	String customerName;
	int balance;
	String bankName;
	
	// implicit constructor - default constructor made by java (hidden from us)
	// As soon as you build your own constructor I will kill the constructor created by me
	
	private Account() {
		System.out.println("I am parent cons");
		bankName = "SBI";
	}
	
	public Account(int accountNo, String customerName) {
		this();
		this.accountNo = accountNo;
		this.customerName = customerName;
		System.out.println("I am parent param cons having 2 params");
	}
	
	public Account(int accountNo, String customerName, int balance) {
		this(accountNo, customerName);
		this.balance = balance;
		System.out.println("I am parent param cons having 3 params");
	}

	void deposit() {
		System.out.println("Account deposit...");
	}
	
	void withdraw() {
		System.out.println("Account withdraw...");
		System.out.println("Verify pin...");
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", customerName=" + customerName + ", balance=" + balance + 
				", bankName=" + bankName + "]";
	}
	
}

class SavingsAccount extends Account{
	
	public SavingsAccount(int accountNo, String customerName, int balance) {
		super(accountNo, customerName, balance);  // this line is always present here (but hidden from us)
		System.out.println("I am child cons");
//		this.accountNo = accountNo;
//		this.customerName = customerName;
//		this.balance = balance;
	}
	
	void ROI() {
		System.out.println("3% ROI will be given");
	}
	void limit() {
		System.out.println("Limit exceeded...");
	}
	void showPAN() {
		System.out.println("Show PAN card please...");
	}
}

class CurrentAccount extends Account{
	public CurrentAccount(int accountNo, String customerName) {
		super(accountNo, customerName);
	}
	void ROI() {
		System.out.println("8% ROI will be given");
	}
}
//
//class DematAccount extends Account{
//	
//}

class Customer{
	SavingsAccount sa;
//	CurrentAccount ca;
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		
//		Account account = new Account(101, "Ram Kumar", 10000);
//		System.out.println(account);
		
		SavingsAccount sa = new SavingsAccount(101, "Ram Kumar", 10000);
		System.out.println(sa.bankName);
		sa.ROI();
		sa.deposit();
		sa.withdraw();
//		sa.limit();
//		sa.ROI();
//		sa.showPAN();
//		
		CurrentAccount ca = new CurrentAccount(102, "Shyam Kumar");
		ca.ROI();
//		ca.deposit();
//		ca.withdraw();
//		ca.ROI();
//		
		// Whenever you define a class it always inherits some other class
		// By default it inherits Object class
		
//		Benefits of inheritance - 
//		1. Reusability
//		2. Polymorphism
		
//		abstract keyword with class says you cannot create an object of this class from outside
//		But child class can talk to the constructor(s) of parent class thereby not stopping the inheritance
//		use abstract class for inheriting and then instantiating the child class
//		
//		default cons has been made private so that no object is created with required values
//		
//		all private cons doesnt mean that your class is equivalent to abstract class
//		coz it will break the inheritance coz child class cons depend on super() when objects are created
	}

}

// public Account(int accountNo, String customerName) {
//this.accountNo = accountNo;
//this.customerName = customerName;
//}
//
//public Account(int accountNo, String customerName, int balance) {
//this(accountNo, customerName);
//this.balance = balance;
//}
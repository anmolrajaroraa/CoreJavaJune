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
	
//	final abstract void abc();
	
	void limit(int limit) {
		System.out.println("Limit is " + limit);
	}
	
	final void KYC() {
		System.out.println("Know your customer properly...");
	}
	
	abstract void ROI();

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", customerName=" + customerName + ", balance=" + balance + 
				", bankName=" + bankName + "]";
	}
	
}

class SavingsAccount extends Account{
	
	public SavingsAccount(int accountNo, String customerName, int balance) {
//		super();     // this line is always present here (but hidden from us)
		super(accountNo, customerName, balance);  
		System.out.println("I am child cons");
//		this.accountNo = accountNo;
//		this.customerName = customerName;
//		this.balance = balance;
	}
	
	@Override
	void ROI() {
		System.out.println("3% ROI will be given");
	}
	@Override
	void limit(int limit) {
		System.out.println("Savings limit is " + limit);
	}
	void showPAN() {
		System.out.println("Show PAN card please...");
	}
	
//	@Override
//	void KYC() {
//		System.out.println("Know your customer");
//	}
}

class CurrentAccount extends Account{
	public CurrentAccount(int accountNo, String customerName) {
		super(accountNo, customerName);
	}
	
	@Override
	void ROI() {
		System.out.println("8% ROI will be taken");
	}
	void limit() {
		System.out.println("No limit");
	}
	void KYC(int documents) {
		System.out.println("Know your customer and ask for " + documents + " documents");
	}
}
//
class DematAccount extends Account{
	public DematAccount(int accountNo, String customerName) {
		super(accountNo, customerName);
	}

	@Override
	void ROI() {
		System.out.println("Some interest will be taken");
	}
	void ROI(int interest) {
		System.out.println(interest + " % will be taken");
	}
}

class Customer{
	SavingsAccount sa;
	CurrentAccount ca;
}

final class MathOperations {
	void add() {
		System.out.println();
	}
	void subtract() {
		
	}
	void multiply() {
		
	}
	void divide() {
		
	}
	void sqrt() {
		
	}
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
		sa.limit(10000);
		sa.KYC();
//		sa.limit();
//		sa.ROI();
//		sa.showPAN();
//		
		CurrentAccount ca = new CurrentAccount(102, "Shyam Kumar");
		ca.ROI();
		ca.limit();
		ca.limit(100000);
		ca.KYC(5);
		ca.KYC();
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
		
		// abstract fns - fns without body - used for enforcing child classes to implement this particular  method acc to them 
		
		// final - constant variable, stop overriding, stop inheritance
		// overriding - signature should be same
		// if you create a fn with same name as parent fn but signature is different then it is overloading
		
//		final vs abstract vs private cons
//		final -> no inheritance, object can be created
//		abstract -> inheritance can be done, object can't be created
//		private cons -> inheritance blocked, object can't be created
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
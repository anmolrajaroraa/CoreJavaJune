package oops;

// interface is 100% abstract (Java 7)
// what to do
// how to do - it is defined by classes
// interface is like a skeleton - declarations of functions
//each fn in interface is by default abstract and public

interface AccountInterface{
	abstract void deposit();
	void withdraw();
	void roi();
}

class NewSavingsAccount implements AccountInterface{

	@Override
	public void deposit() {
		
	}

	@Override
	public void withdraw() {
		
	}

	@Override
	public void roi() {
		
	}
	
}

class NewCurrentAccount implements AccountInterface{

	@Override
	public void deposit() {
		
	}

	@Override
	public void withdraw() {
		
	}

	@Override
	public void roi() {
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
	}

}

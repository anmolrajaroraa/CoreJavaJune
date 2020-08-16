package oops;

interface Loan{
	public abstract void roi();
	void emi();
}

class HomeLoan implements Loan{

	@Override
	public void roi() {
		System.out.println("7% interest");
	}

	@Override
	public void emi() {
		System.out.println("10 years tenure");
	}
	
}

class AutoLoan implements Loan{

	@Override
	public void roi() {
		System.out.println("12% interest");
	}

	@Override
	public void emi() {
		System.out.println("5 years tenure");
	}
	
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
	
	}
}

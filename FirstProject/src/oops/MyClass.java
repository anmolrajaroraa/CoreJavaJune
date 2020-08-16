package oops;

interface Test{
	public abstract void doSomething();
}

class TestChild implements Test, Runnable{

	@Override
	public void doSomething() {
		
	}

	@Override
	public void run() {
		
	}
	
}

public class MyClass {

	public static void main(String[] args) {
		Test test = new TestChild();
		Runnable runnable = new TestChild();
		
		Test test2 = new Test() {
			
			@Override
			public void doSomething() {
				
			}
		};
		
		new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Some anonymous class");
			}
		};
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}



//1. Create an interface
//2. Create a class that implements the interface
//3. Implement all the abstract methods
//4. Create the object of class
//5. Upcast the object to the scope of interface

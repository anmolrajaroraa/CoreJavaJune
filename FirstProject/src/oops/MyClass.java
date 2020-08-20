package oops;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DoSomething implements Runnable{

	@Override
	public void run() {
		System.out.println("Long method...");
	}
	
}

public class MyClass{
	public static void main(String[] args) {
		Runnable runnable = new DoSomething();
		Thread thread = new Thread(runnable);
		
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		Thread thread2 = new Thread(runnable2);
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		Thread thread4 = new Thread(()->{
			System.out.println("I am lambda expression...");
		});
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		// lambda expression can only be applied to SAM interfaces (functional interfaces)
		// SAM - Single Abstract Method
	}
}

//1. Create an interface
//2. Create a class that implements the interface
//3. Implement all the abstract methods
//4. Create the object of class
//5. Upcast the object to the scope of interface

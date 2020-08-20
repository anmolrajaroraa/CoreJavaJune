package oops;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

interface Loan{
	public abstract void roi();
	void emi();
	void approve();
	default void a() {
		
	}
	default void b() {
		
	}
	default void c() {
		
	}
	default void d() {
		
	}
	default void e() {
		
	}
}

abstract class Adapter implements Loan{
	@Override
	public void roi() {
		
	}
	@Override
	public void emi() {
		
	}
	@Override
	public void approve() {
		
	}
	@Override
	public void a() {
		
	}
	@Override
	public void b() {
		
	}
	@Override
	public void c() {
		
	}
	@Override
	public void d() {
		
	}
	@Override
	public void e() {
		
	}
}

class HomeLoan extends Adapter{

	@Override
	public void roi() {
		System.out.println("7% interest");
	}

	@Override
	public void emi() {
		System.out.println("10 years tenure");
	}

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		
	}
	
}

class AutoLoan extends WindowAdapter implements Loan{

	@Override
	public void roi() {
		System.out.println("12% interest");
	}

	@Override
	public void emi() {
		System.out.println("5 years tenure");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		
	}

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo2 {
	public static void main(String[] args) {

	}
}

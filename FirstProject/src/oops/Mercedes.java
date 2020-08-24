package oops;

public class Mercedes implements CarInterface{
int a = 1000;
	
	void automaticWindow() {
		System.out.println("Windows open through buttons");
	}
	void automaticGears() {
		System.out.println("Automatically change gears");
	}
	
	@Override
	public void window() {
		automaticWindow();
	}
	@Override
	public void gears() {
		automaticGears();
	}
}

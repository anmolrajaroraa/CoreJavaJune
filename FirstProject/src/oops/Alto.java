package oops;

public class Alto implements CarInterface{
	int a = 100;
	
	void manualWindow() {
		System.out.println("Windows open through levers");
	}
	void manualGears(int noOfGears) {
		System.out.println("Manually change gears");
	}
	
	@Override
	public void window() {
		manualWindow();
	}
	@Override
	public void gears() {
		manualGears(5);
	}
}

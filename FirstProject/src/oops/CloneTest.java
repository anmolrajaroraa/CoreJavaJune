package oops;

class Accessory implements Cloneable{
	int x = 10;
	int y = 20;
	@Override
	public String toString() {
		return "Accessory [x=" + x + ", y=" + y + "]";
	}
	@Override
	protected Accessory clone() throws CloneNotSupportedException {
		return (Accessory) super.clone();
	}
}

class Car implements Cloneable{
	int a = 10;
	int b = 20;
	Accessory accessory = new Accessory();
	
	@Override
	public String toString() {
		return "Car [a=" + a + ", b=" + b + ", accessory=" + accessory + "]";
	}
	@Override
	protected Car clone() throws CloneNotSupportedException {
		Car car = (Car) super.clone();
		Accessory accessory = car.accessory.clone();
		car.accessory = accessory;
		return car;
	}
	
}

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car = new Car();
		Car car2 = car;
		car2.a = 100;
		car2.b = 200;
		Car car3 = car.clone();
		car3.a = 1000;
		car3.b = 2000;
		car3.accessory.x = 999;
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
	}
}

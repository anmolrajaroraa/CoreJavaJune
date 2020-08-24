package oops;

import java.lang.reflect.InvocationTargetException;

public class Driver{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
//		Alto alto = new Alto();
//		alto.gears();
//		alto.window();
		CarInterface car = CarFactory.getCar();
		car.gears();
		car.window();
	}
}

class Driver2{
	public static void main(String[] args) {
		Alto alto = new Alto();
		alto.gears();
		alto.window();
	}
}

class Driver3{
	public static void main(String[] args) {
		Alto alto = new Alto();
		alto.gears();
		alto.window();
	}
}

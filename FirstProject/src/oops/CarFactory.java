package oops;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class CarFactory {
	static CarInterface getCar() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String className = rb.getString("carname");
		Object object = Class.forName(className).getDeclaredConstructor().newInstance();
		return (CarInterface)object;
	}
//	static Mercedes getCar() {
//		Mercedes mercedes = new Mercedes();
//		return mercedes;
//	}
}

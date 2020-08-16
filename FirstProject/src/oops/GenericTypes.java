package oops;

class Box{
	private Object x;
	
	public void setX(Object x) {
		this.x = x;
	}
	public Object getX() {
		return x;
	}
}

// Generic Type - T
class NewBox<T>{
	private T x;
	
	public void setX(T x) {
		this.x = x;
	}
	public T getX() {
		return x;
	}
}

class AnotherBox<K,V>{
	private K key;
	private V value;
	
	public void setKey(K key) {
		this.key = key;
	}
	public K getKey() {
		return key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public V getValue() {
		return value;
	}
}

public class GenericTypes {

	public static void main(String[] args) {
		Box box = new Box();
		box.setX("ten");
		Integer num = (Integer) box.getX();
		String s = String.valueOf(10);
		
		NewBox<String> box2 = new NewBox<>();
		box2.setX("ten");
		String num2 = box2.getX();
		
//		NewBox<Integer> box3 = new NewBox<>();
//		NewBox<int[]> box4 = new NewBox<>();
		
		AnotherBox<String, Integer> box3 = new AnotherBox<>();
		box3.setKey("English");
		box3.setValue(95);
		
//		Shape shape = new Circle();
//		Rectangle circle = (Rectangle) shape;
	}

}

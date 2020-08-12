package oops;

abstract class Shape{
	int count = 1;
	void draw() {
		System.out.println("Shape draw");
	}
	void rotate() {
		System.out.println("Shape rotate");
	}
	void area() {
		System.out.println("Shape area");
	}
	void perimeter() {
		System.out.println("Shape perimeter");
	}
}

class Circle extends Shape{
	int count = 10 + super.count;
	@Override
	void draw() {
//		super.draw();
		System.out.println("Circle draw using radius");
	}
	@Override
	void area() {
		System.out.println("Area using π * r * r");
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter using 2 * π * r");
	}
	void calculateDiameter() {
		System.out.println("Diameter = 2 * r");
	}
}

class Rectangle extends Shape{
	int count = 100;
	@Override
	void draw() {
		System.out.println("Rectangle draw using length and breadth");
	}
	@Override
	void area() {
		System.out.println("Area using l * b");
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter using 2 * (l+b)");
	}
	void calculateDiagnol() {
		System.out.println("Diagnol using pythagoras");
	}
}

class Square extends Shape{
	int count = 1000;
	@Override
	void draw() {
		System.out.println("Square draw using side");
	}
	@Override
	void area() {
		System.out.println("Area using s * s");
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter using 4 * s");
	}
}

public class UpcastDowncast {
	
	public static void commonFn(Shape shape) {
		shape.draw();
		shape.area();
		shape.perimeter();
		shape.rotate();
		System.out.println(shape.count);
		
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.calculateDiameter();
		}
		else if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.calculateDiagnol();
		}
	}

	public static void main(String[] args) {
		
		commonFn(new Circle());
		commonFn(new Rectangle());
		commonFn(new Square());
		
//		Circle circle = new Circle();
//		commonFn(circle);
////		circle.draw();
////		circle.area();
////		circle.perimeter();
////		circle.rotate();
////		System.out.println(circle.count);
//		
//		Rectangle rectangle = new Rectangle();
//		rectangle.draw();
//		rectangle.area();
//		rectangle.perimeter();
//		rectangle.rotate();
//		System.out.println(rectangle.count);
//		
//		Square square = new Square();
//		square.draw();
//		square.area();
//		square.perimeter();
//		square.rotate();
//		System.out.println(square.count);
		
		/*Shape shape = new Circle();
		shape.draw();
		shape.area();
		shape.perimeter();
		shape.rotate();
		shape.calculateDiameter();
		System.out.println(shape.count);
		
		Circle circle = (Circle)shape;
		System.out.println(circle.count);
		circle.calculateDiameter();
		
		Shape shape2 = new Rectangle();
		shape.draw();
		shape.area();
		shape.perimeter();
		shape.rotate();
		System.out.println(shape.count);
		shape.calculateDiagnol();
		
		Rectangle rectangle = (Rectangle)shape2;
		System.out.println(rectangle.count);
		rectangle.calculateDiagnol();*/
	}

}

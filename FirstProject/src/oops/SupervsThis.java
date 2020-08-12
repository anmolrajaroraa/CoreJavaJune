package oops;

abstract class A1{
	int x; //1000
	A1(){
		x = 100;
		System.out.println("A1 default cons");
	}
	A1(int x){
		this();
		this.x = x;
		System.out.println("A1 Param Cons...");
	}
	void print() {
		System.out.println("Parent print fn...");
	}
}

class A2 extends A1{
	int y;  //2200
	int x = 2000;
	A2(){
		super(1000);
		y = 200;
		y += x;
		System.out.println("A2 default cons");
	}
	A2(int x){
		this();
		System.out.println(x + this.x + super.x + y);
		System.out.println("A2 Param Cons...");
	}
	int specialFn() {
		return super.x;
	}
	@Override
	void print() {
		super.print();
		System.out.println("Child print fn...");
	}
}

class A3 extends A2{
	int y;  //2200
	int x = 2000;
	A3(){
		super(1000);
		y = 200;
		y += x;
		System.out.println("A2 default cons");
	}
	A3(int x){
		this();
		System.out.println(x + specialFn() + super.x + this.x);
		System.out.println("A2 Param Cons...");
	}
	@Override
	void print() {
		super.print();
		System.out.println("A3 print fn...");
	}
}


public class SupervsThis {

	public static void main(String[] args) {
		A2 obj = new A2(100);
		obj.print();
		A3 obj2 = new A3(100);
		obj2.print();
	}

}

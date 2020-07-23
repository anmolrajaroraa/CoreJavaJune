package oops;

//class A{
//	int a = 10;
//	void aa() {
//		
//	}
//}
//class B extends A{
//	int b = 20;
//	private void bb() {
//		
//	}
//}
//
//class C extends B{
//	int c = 30;
//	void cc() {
//		
//	}
//}

class A{
	int a = 10;
	void aa() {
		
	}
}

class B extends A{
	int b = 20;
	void bb() {
		
	}
}

class C extends A{
	int c = 30;
	void cc() {
		
	}
}

class D extends B{
	int d = 40;
	void dd() {
		
	}
}

class E extends B{
	int e = 50;
	void ee() {
		
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
//		B obj = new B();
//		System.out.println(obj.a);
//		obj.aa();
//		
//		C obj2 = new C();
//		System.out.println(obj2.a);
//		System.out.println(obj2.b);
//		System.out.println(obj2.c);
//		obj2.aa();
//		obj2.bb();
//		obj2.cc();
		
		B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.aa();
		obj.bb();
		
		C obj2 = new C();
		System.out.println(obj2.a);
		System.out.println(obj2.c);
		obj2.aa();
		obj2.cc();
		
		D obj3 = new D();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.d);
		obj3.aa();
		obj3.dd();
		
		E obj4 = new E();
		System.out.println(obj4.a);
		System.out.println(obj4.b);
		System.out.println(obj4.e);
		obj4.aa();
		obj4.bb();
		obj4.ee();
	}

}

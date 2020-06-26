class Test{  // titlecase

	public static void main(String[] args){
		Test obj = new Test();
		// obj.a = 12;
		// Test.print();
		if(args.length == 0){
			System.out.println("Please pass 2 arguments");
		}
		if(args.length == 2){
			String a = args[0];
			String b = args[1];
			System.out.println("First number received " + a);
			System.out.println("Second number received " + b);
			System.out.println(a + b);
		}
		System.out.println("\u090B\u0937\u093F");
		// System system = new System();  --> error
	}

}

/*
UTF-8
java command -
1. Bytecode loading - classes load, static things
2. Bytecode verification - signatures
3. Machine code conversion
4. Run machine code - JIT (Just-In-Time) Compilers
*/
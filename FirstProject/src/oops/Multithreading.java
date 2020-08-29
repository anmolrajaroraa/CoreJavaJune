package oops;

class HeavyWork implements Runnable{

	@Override
	public void run() {
		System.out.println("t1 started");
//		for(int i = 0; i < 1000000; i++) {}
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t1 ends");
	}
	
}

class AnotherHeavyWork extends Thread{
	@Override
	public void run() {
		System.out.println("t4 started");
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t4 ends");
	}
}

public class Multithreading {

	public static void main(String[] args) throws InterruptedException {
		// 1. Implement Runnable interface
		// 2. Inherit Thread class
		
		long startTime = System.currentTimeMillis();
		
		Runnable runnable = new HeavyWork();
		Thread t1 = new Thread(runnable);
		t1.start();
//		t1.join();   // dont proceed ahead until thread t1 finishes
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t2 started");
//				for(int i = 0; i < 1000000; i++) {}
				try {
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t2 ends");
			}
		});
		t2.start();
//		t2.join();
		
		Thread t3 = new Thread(() -> {
			System.out.println("t3 started");
//			for(int i = 0; i < 1000000; i++) {}
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t3 ends");
		});
		t3.start();
//		t3.join();
		
//		Thread thread = new AnotherHeavyWork();
//		Thread t4 = new Thread(thread);
//		t4.start();
		
		new Thread(new AnotherHeavyWork()).start();
		
		Thread t5 = new Thread(new Thread()) {
			@Override
			public void run() {
				System.out.println("t5 started");
				try {
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t5 ends");
			}
		};
		t5.start();
		t5.join();
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by all threads to complete is " + (endTime - startTime) );
	}

}

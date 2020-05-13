package com.jit.inner11;

/*Anonymous inner class approach for thread*/
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child thread");
				}
			}
		};
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}

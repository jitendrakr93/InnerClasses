package com.jit.inner13;

/*Anonymous inner class that defines inside Arguments*/
public class ThreadDemo {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
			}
		}).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}

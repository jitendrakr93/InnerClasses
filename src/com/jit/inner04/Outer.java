package com.jit.inner04;

/*From normal or regular inner class we can access both static and non static members of outer 
 class directly*/
public class Outer {
	int x = 10;
	static int y = 20;

	class Inner {
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}

}

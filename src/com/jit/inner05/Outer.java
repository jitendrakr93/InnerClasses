package com.jit.inner05;

/*Within the inner class this always refers current inner class object , if we want to refer 
 current outer class object we have to use OuterClassName.this*/
public class Outer {
	int x = 10;

	class Inner {
		int x = 100;

		public void m1() {
			int x = 1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Inner.this.x);
			System.out.println(Outer.this.x);
		}
	}

	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}

}

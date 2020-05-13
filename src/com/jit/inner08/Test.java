package com.jit.inner08;


public class Test {
	int x = 10;
	static int y = 20;

	public void m1() {
		class Inner {
			public void m2() {
				System.out.println(x);  //If we declare m1() as static then we will get C.E here
				System.out.println(y);
			}
		}

		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}

package com.jit.inner07;

/*We can access method local inner classes only within the method where we declare. Outside the
 method we can't access*/
public class Test {

	public void m1() {
		class Inner {
			public void sum(int x, int y) {
				System.out.println("The sum : " + (x + y));
			}
		}

		Inner i = new Inner();
		i.sum(10, 20);
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		i.sum(20, 40);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}

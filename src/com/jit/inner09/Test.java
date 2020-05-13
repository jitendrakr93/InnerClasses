package com.jit.inner09;

/*From method local inner class we can't access local variables of the method in which
 we declared inner class. If the local variable declared as final then we can access. But this
 is applicable to only 1.7 version from 1.8 its working fine*/
public class Test {
	public void m1() {
		int x = 10;
		class Inner {
			public void m2() {
				System.out.println(x);
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

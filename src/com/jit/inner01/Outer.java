package com.jit.inner01;
/*Accessing inner class code from static area of outer class*/
public class Outer {
	class Inner {
		public void m1() {
			System.out.println("Inner class method");
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		new Outer().new Inner().m1();
	}

}

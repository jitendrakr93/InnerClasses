package com.jit.inner14;

public class Outer {

	static class Nested {
		public void m1() {
			System.out.println("Staic nested class method");
		}
	}

	public static void main(String[] args) {
		Nested n = new Nested();
		n.m1();
	}
}
/*If we want to create nested class object from outside of outer class then we can create as
 *follows :-
 Outer.Nested n = new Outer.Nested();*/

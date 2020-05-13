package com.jit.inner16;

public class Test {
	int x = 10;
	static int y = 20;

	static class Nested {
		public void m1() {
			//System.out.println(x);
			System.out.println(y);
		}
	}
}

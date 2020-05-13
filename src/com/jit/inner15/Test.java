package com.jit.inner15;

public class Test {

	static class Nested {
		public static void main(String[] args) {
			System.out.println("Static nested class main method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer class main method");
	}
}

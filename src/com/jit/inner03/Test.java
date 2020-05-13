package com.jit.inner03;

public class Test {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		new Outer().new Inner().m1();
	}
}

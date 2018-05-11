package com.xwm.a;

public class A {
	private int v = 100;

	public void print(int num) {
		if (v > num) {
			System.out.println("猜小了");
		} else if (v < num) {
			System.out.println("猜小了");
		} else {
			System.out.println("猜对了");
		}
	}

}

package com.xwm.caculator;

public class Number {
	private int n1;
	private int n2;

	public Number(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public void add() {
		System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
	}

	public void sub() {
		System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
	}

	public void multi() {
		System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
	}

	public void div() {
		System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
	}

}

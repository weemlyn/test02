package com.xwm.plural;

public class Math extends Plural {

	public Math() {
		super();
	}

	public Math(double a, double b) {
		super(a, b);

	}

	public void add(double a, double b, double c, double d) {
		double i = a + c;
		double j = b + d;
		System.out
				.println("(" + a + "+" + b + "i" + ")" + "+" + "(" + c + "+" + d + "i" + ")" + "=" + i + "+" + j + "i");
	}

	public void sub(double a, double b, double c, double d) {
		double i = a - c;
		double j = b - d;
		System.out
				.println("(" + a + "+" + b + "i" + ")" + "-" + "(" + c + "+" + d + "i" + ")" + "=" + i + "+" + j + "i");
	}

	public void multi(double a, double b, double c, double d) {
		if (c == 0 && d == 0) {
			System.out.println("你输入的数据不能计算");
		} else {
			double i = a * c;
			double j = -b * d;
			System.out.println(
					"(" + a + "+" + b + "i" + ")" + "*" + "(" + c + "+" + d + "i" + ")" + "=" + i + "+" + j + "i");
		}
	}

	public void div(double a, double b, double c, double d) {
		if (c == 0 && d == 0) {
			System.out.println("你输入的数据不能计算");
		} else {
			double i =(a*c+b*d) / (c*c+d*d);
			double j = (b*c-a*d)/(c*c+d*d);
			System.out.println(
					"(" + a + "+" + b + "i" + ")" + "/" + "(" + c + "+" + d + "i" + ")" + "=" + i + "+" + j + "i");
		}
	}

	
}

package com.xwm.a;

import java.util.Scanner;

public class AaTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请猜一个数字");
		int num = s.nextInt();
		A a = new A();
		a.print(num);

	}

}

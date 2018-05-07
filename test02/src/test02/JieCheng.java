
package test02;

import java.util.Scanner;

public class JieCheng {

	public static void main(String[] args) {
		System.out.println("请输入任意数：");
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int c = 1;
		for (int i = 1; i <= a; i++) {
			c *= i;

		}
		System.out.println("所输入数字的阶乘为：" + c);
		num.close();
		System.out.println("---------------递归----------------");
		System.out.println(fac(a));
	}

	public static int fac(int f) {
		if (f == 1) {
			return 1;
		} else {
			return f * fac(f - 1);
		}
	}

}

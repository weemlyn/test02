
package test02;

import java.util.Scanner;

public class JieCheng {

	public static void main(String[] args) {
		System.out.println("请输入任意数：");
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int c = 1;
		for (int i = 1; i <= a; i++) {
			int b = i * c;
			c = b;
		}
		System.out.println(c);
		num.close();
	}

}

package com.xwm.array;

import java.util.Random;

public class TestTwo {

	public static void main(String[] args) {

		int red[] = new int[6];
		Random d = new Random();
		int e = d.nextInt(33) + 1;
		red[0] = e;
		int count = 1;
		int mark = 0;
		while (count < 6) {
			Random a = new Random();
			int b = a.nextInt(33) + 1;

			for (int j = 0; j < count; j++) {
				if (b == red[j]) {
					mark = 1;
					break;
				} else {
					mark = 0;
				}
			}
			if (mark == 0) {
				red[count] = b;
				count++;
			}
		}

		for (int m = 0; m < 6; m++) {
			if (m == 0) {
				System.out.print("摇出的红球是{" + red[m] + ",");
			} else if (m < 5) {
				System.out.print(red[m] + ",");
			} else {
				System.out.println(red[m] + "}");
			}
		}

		Random c = new Random();
		int blue = c.nextInt(16) + 1;
		System.out.println("摇出的蓝球是{" + blue + "}");
	}

}

package com.java.quiz;

import java.util.Scanner;

public class JudgementDays {
	public static void print(int year, int month, int day) {

		System.out.println("你输入的日期为" + year + "年" + month + "月" + day + "日");
		int days = 0;
		int mday = 0;
		for (int m = 1; m <= month - 1; m++) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				mday = 31;
			} else if (m == 2) {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					mday = 29;
				} else {
					mday = 28;
				}
			} else if (m == 4 || m == 6 || m == 9 || m == 11) {
				mday = 30;
			}
			days += mday;
		}
		days += day;
		System.out.println("今天是今年第" + days + "天");
	}

	public static void main(String[] args) {
		System.out.println("请输入年");
		Scanner y = new Scanner(System.in);
		int year = y.nextInt();
		System.out.println("请输入月");
		Scanner m = new Scanner(System.in);
		int month = m.nextInt();
		System.out.println("请输入日");
		Scanner d = new Scanner(System.in);
		int day = d.nextInt();

		if (year < 0 || month < 0 || day < 0 || month > 12 || day > 31) {
			System.out.println("您输入的日期不合法，请重新输入");
		} else {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day > 30) {
					System.out.println("你输入的日期不合法，请重新输入");

				} else {
					print(year, month, day);

				}
			}
			if (month == 2) {
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					if (day > 29) {
						System.out.println("你输入的日期不合法，请重新输入");
					} else {
						print(year, month, day);
					}
				} else {
					if (day > 28) {
						System.out.println("你输入的日期不合法，请重新输入");
					} else {
						print(year, month, day);
					}
				}
			}
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				print(year, month, day);
			}
		}

	}

}

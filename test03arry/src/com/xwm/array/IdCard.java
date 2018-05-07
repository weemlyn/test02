package com.xwm.array;

import java.util.Scanner;

public class IdCard {

	public static void main(String[] args) {

		 System.out.println("请输入身份证号码：");
		 Scanner b = new Scanner(System.in);
		String a = b.next();
		char num[] =  a.toCharArray();//{ 4, 3, 1, 0, 0, 2, 1, 9, 9, 3, 0, 6, 1, 3, 3, 0, 2, 6 };
		for(int j=0;j<=17;j++) {
		System.out.println(num[j]);}
			 
		int sum = 0;
		int c[] = new int[] { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		char last[] = new char[] { 1, 0, 'x', 9, 8, 7, 6, 5, 4, 3, 2 };
		for (int i = 0; i < 17; i++) {
			int d = num[i] * c[i];
			sum += d;
		}
		int e = sum % 11;

		if (last[e] == num[17]) {
			System.out.println("身份证号码正确");
		} else {
			System.out.println("身份证号码不正确");
		}

	}

}

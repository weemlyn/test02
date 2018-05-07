package com.xwm.array;

import java.util.Scanner;

public class LineArray {

	public static void main(String[] args) {
		int[] arr = new int[7];
		for (int i = 0; i < 7; i++) {
			Scanner a = new Scanner(System.in);
			System.out.println("请输入第" + (i + 1) + "个数据(共7个):");
			arr[i] = a.nextInt();
		}
		System.out.println("输入的数据为：");
		for (int n = 0; n < 7; n++) {
			System.out.print(arr[n] + " ");
		}
		System.out.println("");
		System.out.println("从小到大排序为：");
		for (int j = 0; j < 7; j++) {
			for (int m = j; m < 7; m++) {
				if (arr[m] < arr[j]) {
					int b = arr[j];
					arr[j] = arr[m];
					arr[m] = b;
				}
			}
		}
		for (int m = 0; m < 7; m++) {
			System.out.print(arr[m] + " ");
		}

	}

}

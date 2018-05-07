package com.xwm.array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int count[]=new int[10];
		System.out.println("请输入十个数据：");
		for(int i=0;i<10;i++) {
			
			Scanner a=new Scanner(System.in);
			int num=a.nextInt();
			count[i]=num;
		}
		int max=count[0];
		int min=count[0];
		for(int m=1;m<10;m++) {
			if(count[m]>max) {
				max=count[m];
			}
		}
		System.out.println("最大数是："+max);
		for(int n=0;n<10;n++) {
			if(count[n]<min) {
				min=count[n];
			}
			
		}
		System.out.println("最大数是："+min);

	}

}

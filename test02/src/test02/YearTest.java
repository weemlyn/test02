package test02;

import java.util.Scanner;

public class YearTest {
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		@SuppressWarnings("resource")
		Scanner year=new Scanner(System.in);
		int a=year.nextInt();
		int b=a%4;
		int c=a%100;
		int d=a%400;
		if(b==0&c!=0|d==0) {
			
			System.out.println("该年是闰年");
		}
		else {
			System.out.println("该年不是闰年");
			}
	}

}

package test02;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		System.out.println("请输入任意数：");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		for(int i=num;i>0;i--) {
			for(int j=0;j<=num;j++) {
				if(j>i) {
					System.out.print("*");
				}
				if(j<i) {
					System.out.print(" ") ;
				}
				if(j==num) {
					System.out.println("*");
				}
			}
		}
		

	}

}

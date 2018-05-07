package test02;

import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("请输入一个十进制数：");
		int ten=a.nextInt();
		int b=1;
		int i=0;
		int c=1;
		int d=ten;
		while(d>0&&c>=0) {
	
			c=d%2;
			d/=2;
			i++;
			
			if(d==0&c==0) {
			break;
			}
		}
		System.out.println();
		int e=1;
		int two=0;
		for(int j=0;j<=i;j++) {
			e=ten%2;
			ten/=2;
			two+=e*((int)Math.pow(10, j));
		
		}
		System.out.println("二进制数为："+two);

	}

}

package test_fromwechat0507;

import java.util.Scanner;

public class BackNumber {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("请输入数据:");
		int num=a.nextInt();
		int i=0;
		int b=num;
		while(b>0) {
			b/=10;
			i++;
			}
		int back=0;
		for(int j=i;j>=0;j--){
			int c=num%10;
			num/=10;
			back+=(c*((int)Math.pow(10, j-1)));
		}
		System.out.println("数字反向为："+back);

	}

}

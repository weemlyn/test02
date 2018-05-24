package com.xwm.lottery;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
	private int red[];
	private int blue;
	

	public int[] getRed() {
		return red;
	}

	public void setRed(int[] red) {
		this.red = red;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	Scanner sc=new Scanner(System.in);

	public void setLottery(int flag) {
		System.out.println("请选择生成彩票的方式：1.自定义；2.随机生成");
		//int flag=sc.nextInt();
		if(flag==1) {
		diy();
		}
		else if(flag==2){
			random();
		}
		
	}

	public  void diy() {
		red=new int[6];
		int count=0;
		boolean mark=true;
		while(count<6) {
			System.out.println("请输入你要买的第"+(count+1)+"个红球[1号至33号]");
			int b=sc.nextInt();
			for(int i=0;i<count;i++) {
				if(red[i]==b) {
					System.out.println("你输入的数字有重复");
					mark=false;
					break;
				}
				else if(red[i]!=b) {
					mark=true;
				}
			}
			if(mark) {
				red[count]=b;
				count++;
			}
		}
		System.out.println("请输入你要买的篮球[1号至16号]");
		int b=sc.nextInt();
		blue=b;
	}

	public void random() {
		red=new int[6];
		int count=0;
		boolean mark=true;
		while(count<6) {
			Random a = new Random();
			int b = a.nextInt(33) + 1;
			for(int i=0;i<count;i++) {
				if(red[i]==b) {
					mark=false;
					break;
				}
				else if(red[i]!=b) {
					mark=true;
				}
			}
			if(mark) {
				red[count]=b;
				count++;
			}
			
		}
		Random a = new Random();
		blue= a.nextInt(16) + 1;
	}
	

}

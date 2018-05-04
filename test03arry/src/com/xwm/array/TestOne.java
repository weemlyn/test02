package com.xwm.array;

public class TestOne {

	public static void main(String[] args) {
		
		int[] score=new int[]{1,5,9,7,8,9,2,3,4};
		int a=0;	
		
		for (int i = 0; i < 9; i++) {
			if(score[i]==9) {
				int b=a+1;
				int[] num=new int[b];
				
				num[a]=i;
				System.out.print(num[a]+" ");
				a++;
			}
				
		}
		
	}

}

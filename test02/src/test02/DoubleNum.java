package test02;

import java.util.Scanner;

public class DoubleNum {

	public static void main(String[] args) {
	  int sum=0;
      for(int i=1;i<=100;i++) {
   
    	 if(i%2==0) {
    		 System.out.print(i+"\t");
    		 sum+=i;
    	 }
    	 if(i%10==0) {
    		 System.out.println("");
    	 }
      }
      System.out.println("偶数和为"+sum);
      
      
      
      System.out.println("请输入一个任意数：");
      Scanner a=new Scanner(System.in);
      int tmp=a.nextInt();
      printOdd(tmp);
      }
     
	private static void printOdd(int num) {
		 for(int j=0;j<=num;j++) {
			 if(j%2==1) {
				 System.out.println(j);
			 }
		 }
			}

	}

	


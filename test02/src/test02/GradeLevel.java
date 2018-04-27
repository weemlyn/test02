package test02;


import java.util.Scanner;


public class GradeLevel {
	public static void main(String[] args) {
		System.out.println("请输入学生成绩：");
		Scanner grade = new Scanner(System.in);
		int a = grade.nextInt();
		if(a>=90) {
			System.out.println("一个优秀的分数,你好棒啊");
		}
		if(a<90&a>=80) {
			System.out.println("一个评为良好的分数,加油啊");
		}
		if(a<80&a>=70) {
			System.out.println("一个评为良的分数，再加把劲");
		}
		if(a<70&a>=60) {
			System.out.println("一个刚刚及格的分数，还需努力");
		}
		if(a<60) {
			System.out.println("这真是一个杯具");
		}
		grade.close();
		}
	}

	
	



package com.xwm.studentmanage;

import java.util.Scanner;

public class StudentManage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生数量");
		int studentNum=sc.nextInt();
		Student[] student =new Student[studentNum];
		for(int i=0;i<student.length;i++) {
			student[i]=new Student();
			System.out.println("请输入学生学号");
			String ID=sc.next();
			System.out.println("请输入学生姓名");
			String name=sc.next();
			//System.out.println("请输入学生分数");
			//double score=sc.nextInt();
			student[i].setID(ID);
			student[i].setName(name);
			student[i].score();
			//student[i].setScore(score);
		}
		for(int i=0;i<student.length;i++) {
			student[i].display();
		}
	}
}

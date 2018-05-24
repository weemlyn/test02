package com.xwm.studentmanage;

import java.util.Scanner;

public class StudentManage2 {
	private Student[] student;

	public StudentManage2(int length) {
		super();
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入学生数量");
		length=sc.nextInt();
		this.student = new Student[length];
	}

	public void add() {
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入学生学号");
			student[i].setID(sc.next());
			System.out.println("请输入学生姓名");
			student[i].setName(sc.next());
			student[i].score();

		}

	}

	public void remove() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入欲删除学生的学号");
		String flag=sc.next();
		boolean a=false;
		for(int i=0;i<student.length;i++) {
			if(student[i].getID().equals(flag)) {
				student[i].setID(null);
				student[i].setName(null);
				student[i].setScore(0);
				a=true;
				break;
			}
		}
		if(a==false) {
			
			System.out.println("你输入的学号不存在");
		}
		

	}

	public void check() {
		for (int i = 0; i < student.length; i++) {
			student[i].display();
		}

	}

	public void find() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入想查找学生的学号");
		String flag=sc.next();
		boolean a=false;
		for(int i=0;i<student.length;i++) {
			if(student[i].getID().equals(flag)) {
				System.out.println("查找的学生信息如下：");
				student[i].display();
				a=true;
				break;
			}
		}
		if(a==false) {
			
			System.out.println("你输入的学号不存在");
		}

	}

}

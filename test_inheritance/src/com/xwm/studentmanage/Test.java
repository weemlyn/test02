package com.xwm.studentmanage;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		StudentManage2 sm = new StudentManage2(2);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.添加学生信息");
			System.out.println("2.显示所有学生");
			System.out.println("3.通过学号查询学生信息");
			System.out.println("4.通过学号删除学生信息");
			System.out.println("5.退出");
			System.out.println("请选择：[1/2/3/4/5]");
			int choose = sc.nextInt();
			if (choose == 1) {
				sm.add();
			}
			if (choose == 2) {
				sm.check();
			}
			if (choose == 3) {
				sm.find();
			}
			if (choose == 4) {
				sm.remove();
			}
			if (choose == 5) {
				System.exit(0);
			}

		}
	}
}

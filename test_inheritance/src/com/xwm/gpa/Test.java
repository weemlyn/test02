package com.xwm.gpa;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学生数目：");
		int studentNum = sc.nextInt();
		Student[] student = new Student[studentNum];
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			System.out.println("请输入学生名字：");
			String name=sc.next();
			student[i].setName(name);
			System.out.println("请输入课程数目：");
			int coursesNum = sc.nextInt();
			String[] courses = new String[coursesNum];
			String[] grades = new String[coursesNum];
			for (int j = 0; j < coursesNum; j++) {
				System.out.println("请输入课程名称：");
				courses[j]=sc.next();
				
				System.out.println("是否有课程等级：(y/n)");
				String flag=sc.next();
				if(flag.equals("y")) {
				System.out.println("请输入课程等级：(ABCD)");
				grades[j]=sc.next();
				}	
				else if(flag.equals("n")){
					grades[j]="无等级";
				}
			}
			student[i].setCourses(courses);
			student[i].setGrades(grades);
			}
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getCourses()+"  "+student[i].getGrades());
			for (int j = 0; j < student[i].getCourses().length; j++) {
				//System.out.println(student[i].getCourses()[j]+"  "+student[i].getGrades()[j]);
				//student[i].getGPA(student[i].getGrades()[j]);
				
				student[i].show();
				}		
			}

		}

	}



package com.xwm.gpa;
/**
 * 
 * @author xieweemyn
 *
 */

public class Student {
	private String name;
	private double gpa;
	private String courses[];
	private String grades[];
	
	public void show() {
		System.out.println("姓名:"+name);
		for(int i=0;i<courses.length;i++) {
			System.out.println("课程:"+courses[i]+" "+"等级:"+grades[i]);
			System.out.println("GPA:"+gpa);
		}
	}
	
	public double getGPA(String grade) {
		if(grade.equals("A+")) {
			gpa=4.0d;
		}
		if(grade.equals("A")) {
			gpa=3.75d;
		}
		if(grade.equals("A-")) {
			gpa=3.25d;
		}
		if(grade.equals("B+")) {
			gpa=3.0d;
		}
		if(grade.equals("C+")) {
			gpa=2.75d;
		}
		if(grade.equals("C")) {
			gpa=2.25d;
		}
		if(grade.equals("C-")) {
			gpa=2.0d;
		}
		if(grade.equals("D+")) {
			gpa=1.75d;
		}
		if(grade.equals("D")) {
			gpa=1.25d;
		}
		if(grade.equals("D-")) {
			gpa=1.0d;
		}
		
	
		return gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String[] getGrades() {
		return grades;
	}

	public void setGrades(String[] grades) {
		this.grades = grades;
	}
	

}

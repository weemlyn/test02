package com.xwm.teacherstudent;

public class Teacher {
	String name;
	int year;
	String lesson;
	String profession;
	
	public void print() {
		System.out.println("姓名："+name+"\n"+"专业方向："+profession+"\n"+"所教课程:"+lesson+"\n"+"教龄："+year);
	}

}

package com.xwm.student;

public class Test {

	public static void main(String[] args) {
		StudentAchievement s = new StudentAchievement("语文", "数学", "英语", "科学");
		StudentAchievement stu1 = new StudentAchievement(79, 89, 98, 88);
		StudentAchievement stu2 = new StudentAchievement(89, 96, 98, 93);
		
		stu1.setName("张三");
		stu1.setClassroom(100);
		System.out.println(stu1.getName() + "\t" + stu1.getClassroom());
		s.print();
		stu1.prints();
		stu1.getMark();
		stu1.getSum();
		stu1.getAverage();
		
		stu2.setName("李四");
		stu2.setClassroom(101);
		System.out.println(stu2.getName() + "\t" + stu2.getClassroom());
		s.print();
		stu2.prints();
		stu2.getMark();
		stu2.getSum();
		stu2.getAverage();

	}

}

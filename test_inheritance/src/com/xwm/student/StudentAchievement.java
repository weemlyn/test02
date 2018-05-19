package com.xwm.student;

public class StudentAchievement extends Subject_Score {

	public StudentAchievement() {
		super();

	}

	public StudentAchievement(int s1, int s2, int s3, int s4) {
		super(s1, s2, s3, s4);
		super.getSum();
		super.getAverage();

	}

	public StudentAchievement(String sub1, String sub2, String sub3, String sub4) {
		super(sub1, sub2, sub3, sub4);

	}

	public void print() {
		System.out.println(getSub1() + "\t" + getSub2() + "\t" + getSub3() + "\t" + getSub4());

	}

	public void prints() {

		System.out.println(getS1() + "\t" + getS2() + "\t" + getS3() + "\t" + getS4());
		System.out.println("总成绩：" + sum);
		System.out.println("平均分：" + avr);
	}

}

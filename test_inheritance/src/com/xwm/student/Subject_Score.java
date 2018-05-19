package com.xwm.student;

import java.util.Scanner;

public class Subject_Score {
	private String name;
	private int classroom;

	private String sub1, sub2, sub3, sub4;
	private int s1, s2, s3, s4;
	private String review;
	int sum;
	int avr;

	public Subject_Score(String sub1, String sub2, String sub3, String sub4) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}

	public Subject_Score(int s1, int s2, int s3, int s4) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	public Subject_Score() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}

	public String getSub4() {
		return sub4;
	}

	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public int getS3() {
		return s3;
	}

	public void setS3(int s3) {
		this.s3 = s3;
	}

	public int getS4() {
		return s4;
	}

	public void setS4(int s4) {
		this.s4 = s4;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public void getSum() {
		sum = s1 + s2 + s3 + s4;

	}

	public void getAverage() {
		avr = sum / 4;

	}

	public void getMark() {
		Scanner m = new Scanner(System.in);
		System.out.println("请输入评语");
		review = m.next();
		System.out.println("评语：" + review);
	}

}

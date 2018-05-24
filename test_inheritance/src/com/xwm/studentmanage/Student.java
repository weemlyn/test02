package com.xwm.studentmanage;

public class Student {
	private String ID;
	private String name;
	private double score;
	public Student() {
	
	}
	public Student(String iD, String name, double score) {
		super();
		ID = iD;
		this.name = name;
		this.score = score;
	}
	public void display() {
		System.out.println("学号"+ID+" 姓名："+name+" 分数："+score);
	}
	public void score() {
		long score=Math.round(Math.random()*(100-60)+60);
		this.score=score;
		
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	

}

package com.xwm.person;

public class Homework2 {

	public static void main(String[] args) {
		State s1=new State();
		s1.setName("中国");
		s1.showMassage();
		State s2=new State("Tom", "男", 23);
		s2.setName("英国");
	    s2.showMassage();
		State s3=new State("Rose", "女", 25);
		s3.showMassage();
		State s4=new State("妻夫木聪", "男", 30, "日本");
		s4.showMassage();

	}

}

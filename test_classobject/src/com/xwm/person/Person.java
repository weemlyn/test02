package com.xwm.person;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name+"今年"+age+"岁");
	}

}

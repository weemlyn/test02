package com.java.custom;

public class Customer {
	private int age;
	private String name;
	private double money;

	public Customer(int age, String name, double money) {
		super();
		this.age = age;
		this.name = name;
		this.money = money;
	}

	public Customer() {

	}

	public void service() {
		System.out.println("服务中");
	}

	public void print() {
		System.out.println(name + " " + age + " " + money);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}

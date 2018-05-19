package com.xwm.pet;

import java.util.Scanner;

public class Pet {
	private String name;
	private int age;
	private String gender;
	private String partner;
	public Pet(String name, int age, String gender, String partner) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
		
		/*Scanner a=new Scanner(System.in);
		System.out.println("请输入名字");
		name=a.next();
		System.out.println("请输入年纪");
		age=a.nextInt();
		System.out.println("请输入性别");
		gender=a.next();
		System.out.println("请输入配偶");
		partner=a.next();
		*/
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	 

}

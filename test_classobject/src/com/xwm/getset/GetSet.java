package com.xwm.getset;

public class GetSet {
	private String name;
	private int age;
	
	
	public GetSet() {
	
	}

	public GetSet(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	//public void print() {
		//System.out.println(name+age+"岁");
	//}

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
	
	

}

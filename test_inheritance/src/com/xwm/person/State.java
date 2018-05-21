package com.xwm.person;

public class State extends Person{
	private String name;

	public State(String name, String sex, int age, String name2) {
		super(name, sex, age);
		this.name = name2;
	}

	public State() {
		super();
		
	}

	public State(String name, String sex, int age) {
		super(name, sex, age);
		this.name="美国";
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showMassage() {
		System.out.println(super.getName()+"\t"+getAge()+"\t"+getSex()+"\t"+getName());
	}
	

	


	

}

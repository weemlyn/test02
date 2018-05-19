package com.xwm.car;

public class Car {
	private String color;
	private String model;
	public Car() {
		color="红色";
		model="轿车";
	}
	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	public void showColor() {
		System.out.println("此车颜色是"+color);
	}
	public void showModel() {
		System.out.println("此车型号是"+model);
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}

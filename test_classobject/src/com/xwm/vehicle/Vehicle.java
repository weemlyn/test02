package com.xwm.vehicle;

public class Vehicle {
	private int size;
	private int speed;

	public Vehicle(int size, int speed) {
		super();
		this.size = size;
		this.speed = speed;
	}

	public void move() {
		System.out.println("汽车"+size+"米长,"+speed+"码起步"+"\n"+"开车了");
	}

	public void setSpeed(int sp) {
		this.speed = sp;
		System.out.println("现在把车开到" + speed + "码");
	}

	public void speedDown() {
		speed -= 10;
		System.out.println("汽车降速了10码，现在码数为：" + speed);

	}

	public void speedUp() {
		speed += 10;
		System.out.println("汽车加速了10码，现在码数为：" + speed);

	}

}

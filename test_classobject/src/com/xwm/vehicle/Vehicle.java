package com.xwm.vehicle;

public class Vehicle {
	int size;
	int speed;

	public void move() {
		System.out.println("汽车开车了");
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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

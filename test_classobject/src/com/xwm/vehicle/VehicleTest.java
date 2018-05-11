package com.xwm.vehicle;

import java.util.Scanner;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
		Scanner a = new Scanner(System.in);
		System.out.println("输入你想开到多少码？");
		int s = a.nextInt();
		v.setSpeed(s);
		v.speedUp();
		v.speedDown();

	}

}

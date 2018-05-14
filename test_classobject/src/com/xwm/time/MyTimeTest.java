package com.xwm.time;

public class MyTimeTest {

	public static void main(String[] args) {
		MyTime time = new MyTime(23, 59, 59);
		time.display();
		time.addHour(1);
		time.display();
		time.addMinute(2);
		time.display();
		time.addSecond(3);
		time.display();
		time.subHour(4);
		time.display();
		time.subMinute(5);
		time.display();
		time.subSecond(6);
		time.display();

	}

}

package com.xwm.time;

public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void addSecond(int sec) {
		second += sec;
	}

	public void addMinute(int min) {
		minute += min;
	}

	public void addHour(int hou) {
		hour += hou;
	}

	public void subSecond(int sec) {
		second -= sec;
	}

	public void subMinute(int min) {
		minute -= min;
	}

	public void subHour(int hou) {
		hour -= hou;
	}

	public void display() {
		System.out.println("现在的时间是" + hour + ":" + minute + ":" + second);
	}

}

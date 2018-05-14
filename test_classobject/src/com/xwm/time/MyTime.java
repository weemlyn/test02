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
		if(second>59) {
			second-=60;
			minute+=1;
			if(minute>59){
				minute-=60;
				hour+=1;
				if(hour>23) {
					hour-=24;
					System.out.println("第二天");
				}
			}
		}
	}

	public void addMinute(int min) {
		minute += min;
		if(minute>59) {
			minute-=60;
			hour+=1;
			if(hour>23) {
				hour-=24;
				System.out.println("第二天");
			}
		}
	}

	public void addHour(int hou) {
		hour += hou;
		if(hour>23) {
			hour-=24;
			System.out.println("第二天");
		}
	}

	public void subSecond(int sec) {
		second -= sec;
		if(second<0) {
			second+=60;
			minute-=1;
			if(minute<0){
				minute+=60;
				hour-=1;
				if(hour<0) {
					hour+=24;
					System.out.println("前一天");
				}
			}
		}
	}

	public void subMinute(int min) {
		minute -= min;
		if(minute<0){
			minute+=60;
			hour-=1;
			if(hour<0) {
				hour+=24;
				System.out.println("前一天");
			}
		}
	}

	public void subHour(int hou) {
		hour -= hou;
		if(hour<0) {
			hour+=24;
			System.out.println("前一天");
		}
	}

	public void display() {
		System.out.println("现在的时间是" + hour + ":" + minute + ":" + second);
	}

}

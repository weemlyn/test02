package com.xwm.Eat;
import java.util.Date;
public class Test {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("现在的时间是"+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());

		Person p1=new Chinese();
		Person p2=new Foreigners();
		p1.Dinner_Time();
		p2.Dinner_Time();
		
	}

}

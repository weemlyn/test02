package com.xwm.Eat;
import java.util.Date;
public abstract class Person {
	public void Dinner_Time() {
		Date date=new Date();
		//int hour=12;
		int hour=date.getHours();
		if(hour>=7&hour<8) {
			breakfast();
		}
		else if(hour>=11&hour<13) {
			lunch();
			
		}
		else if(hour>=17&hour<20) {
		dinner();
		}
		else {
			System.out.println("现在不是就餐时间");
		}
	};

	public abstract void breakfast();

	public abstract void lunch();

	public abstract void dinner();

}

package com.xwm.Eat;

public class Foreigners extends Person{

	@Override
	public void breakfast() {
		System.out.println("外国人早晨吃：面包加黄油，牛奶，火腿");
		
	}

	@Override
	public void lunch() {
		System.out.println("外国人中午吃：汉堡，炸马铃薯，一些蔬菜");
		
	}

	@Override
	public void dinner() {
		System.out.println("外国人晚上吃：萨饼，蔬菜，牛肉，水果，甜点，面包");
		
	}


}

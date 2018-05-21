package com.xwm.Eat;

public class Chinese extends Person{

	@Override
	public void breakfast() {
		System.out.println("中国人早晨吃：包子，油条，粥和豆浆");
		
	}

	@Override
	public void lunch() {
		System.out.println("中国人中午吃：米饭，馒头，蔬菜和肉类");
		
	}

	@Override
	public void dinner() {
		System.out.println("中国人晚上吃：粥，馒头，蔬菜和水果");
		
	}

}

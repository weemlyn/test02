package com.xwm.car;

public class Homework1 {

	public static void main(String[] args) {
		CarHonda c1=new CarHonda("蓝色", "轿车", "进口本田");
		c1.showModel();
		c1.showColor();
		c1.showProduce();
		System.out.println("");
		
		CarHonda c2=new CarHonda();
		c2.setModel("跑车");
		c2.showModel();
		c2.showColor();
		c2.showProduce();
		System.out.println("");
		
		Car c3=new Car();
		c3.showModel();
		c3.showColor();
		
	}

}

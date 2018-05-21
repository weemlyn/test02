package com.xwm.box;

public class Homework5 {

	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box();
		Box b3=new Box(3, 3, 3);
		BoxWeight b4=new BoxWeight(4, 4, 4, 4);
		b2.setDepth(2);
		b2.setHeight(2);
		b2.setWidth(2);
		b1.print();
		b2.print();
		b3.print();
		b4.print();

	}

}

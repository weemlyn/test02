package com.xwm.getset;

public class GetSetTest {

	public static void main(String[] args) {
		GetSet p1=new GetSet("李四",25);
		p1.print();
		
		GetSet p2=new GetSet();
		p2.setAge(20);
		p2.setName("王五");
		p2.print();

	}

}

package com.java.custom;

public class CustomTest {

	public static void main(String[] args) {
		Client p1 = new Client(20, "Tom", 10000);
		p1.print();

		Client p2 = new Client();
		p2.setAge(25);
		p2.setName("Jack");
		p2.setMoney(20000);
		System.out.println(p2.getName() + " " + p2.getAge() + " " + p2.getMoney());
		
		VipClient p3=new VipClient(30, "David", 80000, "vip");
		System.out.println(p3.getName() + " " + p3.getAge() + " " + p3.getMoney()+" "+p3.getVip());
		p3.service();
		p3.tousu();

	}

}

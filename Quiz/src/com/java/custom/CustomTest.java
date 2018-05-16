package com.java.custom;

public class CustomTest {

	public static void main(String[] args) {
		Customer p1 = new Customer(20, "Tom", 10000);
		p1.print();

		Customer p2 = new Customer();
		p2.setAge(25);
		p2.setName("Jack");
		p2.setMoney(20000);
		System.out.println(p2.getName() + " " + p2.getAge() + " " + p2.getMoney());
		p2.service();
		
		VipCustomer p3=new VipCustomer(30, "David", 80000, 3);
		System.out.println(p3.getName() + " " + p3.getAge() + " " + p3.getMoney()+" VIP"+p3.getVip()+"级");
		p3.tousu();

	}

}

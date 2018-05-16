package com.java.custom;

public class VipCustomer extends Customer {
	private int vip;

	public VipCustomer(int age, String name, double money, int vip) {
		super(age, name, money);
		this.vip = vip;
	}

	public int getVip() {
		return vip;
	}

	public void setVip(int vip) {
		this.vip = vip;
	}

	

	public void tousu() {
		System.out.println("投诉中");
	}

}

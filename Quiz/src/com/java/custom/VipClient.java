package com.java.custom;

public class VipClient extends Client {
	private String vip;

	public VipClient(int age, String name, double money, String vip) {
		super(age, name, money);
		this.vip = vip;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public void service() {
		System.out.println("VIP service");
	}

	public void tousu() {
		System.out.println("tousu");
	}

}

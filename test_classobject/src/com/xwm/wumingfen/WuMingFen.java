package com.xwm.wumingfen;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	public WuMingFen() {
		super();
	}
	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		super();
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	public WuMingFen(String theMa, int quantity) {
		super();
		this.theMa = theMa;
		this.quantity = quantity;
	}
	public String getTheMa() {
		return theMa;
	}
	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isLikeSoup() {
		return likeSoup;
	}
	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
	public void check() {
		System.out.print(theMa+quantity+"两");
		if(likeSoup==false) {
			System.out.println("不要汤");
		}
		else {
			System.out.println("要汤");
		}
	}
	
	
	

}

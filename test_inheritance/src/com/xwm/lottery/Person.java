package com.xwm.lottery;

public class Person {
	private String name;
	private String acount;
	//private int red[];
	//private int blue;
	private int cp[];
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAcount() {
		return acount;
	}


	public void setAcount(String acount) {
		this.acount = acount;
	}


	public int[] getCp() {
		return cp;
	}


	public void setCp(int[] cp) {
		this.cp = cp;
	}


	public Person(String name) {
		super();
		this.name = name;
		
	}


	public void buyLottery() {
		Lottery lottery=new Lottery();
		lottery.setLottery(2);
		System.out.println("0");
		cp=new int[7];
		for(int i=0;i<6;i++) {
			cp[i]=lottery.getRed()[i];
			
		}
		cp[6]=lottery.getBlue();
		System.out.print("你购买的红球是：");
		for(int i=0;i<6;i++) {
			System.out.print("\t"+cp[i]);
	
		}
		System.out.println("");
		System.out.println("你购买的蓝球是："+cp[6]);
		
	}


	public Person() {
		super();
		
	}
	

}

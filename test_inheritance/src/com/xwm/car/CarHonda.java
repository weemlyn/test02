package com.xwm.car;

public class CarHonda extends Car{
	String produce;
	
	public void showProduce() {
		System.out.println("厂商为"+produce);
	}

	public CarHonda() {
	    this("黑色");
		//this() 调用在当前类的带*个参数的构造方法
	}


	public CarHonda(String color) {
		setColor(color);
		produce="广州本田";
		
	}
	


	public CarHonda(String color, String model,String produce) {
		super(color, model);
		this.produce = produce;

	}


	public String getProduce() {
		return produce;
	}


	public void setProduce(String produce) {
		this.produce = produce;
	}
	

}

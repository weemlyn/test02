package com.xwm.wumingfen;

public class WuMingFenTest {

	public static void main(String[] args) {
		WuMingFen f1=new WuMingFen("牛肉码",3,true);
		f1.check();
		WuMingFen f2=new WuMingFen("牛肉码",2);
		f2.setLikeSoup(true);
		f2.check();
		WuMingFen f3=new WuMingFen();
		f3.setTheMa("青菜码");
		f3.setQuantity(3);
		f3.setLikeSoup(false);
		f3.check();		

	}

}

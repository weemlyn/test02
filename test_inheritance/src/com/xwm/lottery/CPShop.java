package com.xwm.lottery;

public class CPShop {
	static int[] zjhm = new int[7];

	public static void kaiJiang() {
		Lottery cpshop = new Lottery();
		cpshop.random();
		
		for(int i=0;i<6;i++) {
			zjhm[i]=cpshop.getRed()[i];
			
		}
		zjhm[6]=cpshop.getBlue();
		System.out.print("开奖的红球是：");
		for(int i=0;i<6;i++) {
			System.out.print("\t"+zjhm[i]);
	
		}
		System.out.println("");
		System.out.println("开奖的蓝球是："+zjhm[6]);
		
	}
	

	public static double duiJiang(int cp[]) {
		int count1 = 0;
		int count2 = 0;
		double prize=0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (zjhm[i] == cp[j])

				{
					count1++;
				}

			}

		}
		if(zjhm[6]==cp[6]) {
			count2++;
		}
		if(count1==6&&count2==1) {prize=10000000;
			//prize="恭喜你获得一等奖，奖金1000万";
		}
		else if(count1==6&&count2==0) {prize=5000000;
			//prize="恭喜你获得二等奖，奖金500万";
		}
		else if(count1==5&&count2==1) {prize=3000;
			//prize="恭喜你获得三等奖，奖金3000";
		}
		else if(count1==4&&count2==1) {prize=200;
			//prize="恭喜你获得四等奖，奖金200";
		}
		else if((count1==4&&count2==0)||(count1==3&&count2==1)) {prize=10;
			//prize="恭喜你获得五等奖，奖金10";
		}
		else if((count1==0||count1==1||count1==2)&&count2==1) {prize=5;
			//prize="恭喜你获得六等奖，奖金5";
		}
		else {prize=0;
			//prize="很遗憾，没有中奖";
		}
		return prize;
	}
	public static void main(String[] args) {
		Person p1=new Person("张三");
		System.out.println("");
		double a=0;
		double acount=0;
		int b=0;
		kaiJiang();
		while(b<100000) {
		p1.buyLottery();
		System.out.println("");
		
		System.out.println("顾客："+p1.getName());
		System.out.println("奖金："+duiJiang(p1.getCp()));
		a+=2;
		acount+=duiJiang(p1.getCp());
		b++;
		System.out.println(b);
		System.out.println("买彩票钱"+a);
		System.out.println("奖金"+acount);
		System.out.println("盈利"+(acount-a));
		}
		
	}

}

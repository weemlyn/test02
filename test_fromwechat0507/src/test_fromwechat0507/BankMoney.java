package test_fromwechat0507;

public class BankMoney {

	public static void main(String[] args) {
		double money=10000;
		for(int i=1;i<=5;i++) {
			money*=1.003;
		}
		System.out.println("五年后的本金为："+money);

	}

}

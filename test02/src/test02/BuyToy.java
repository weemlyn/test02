package test02;

public class BuyToy {

	public static void main(String[] args) {
		double money = 0;
		int day = 0;

		while (money < 100) {
			money = money + 5;
			day++;
			if (money >= 100) {
				System.out.println("需要天数为：" + day);
				break;
			}
			money = money - 2.5;
			int b = day % 5;
			if (b == 0) {
				money = money - 6;
			}

		}

	}

}

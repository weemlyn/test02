package test_fromwechat0507;

public class FragWell {

	public static void main(String[] args) {
		int well=0;
		int day=0;
		while(well<7) {
			well+=3;
			day++;
			if(well>=7) {
				break;
			}
			well-=2;		
		}
		System.out.println("需要的天数为："+day);

	}

}

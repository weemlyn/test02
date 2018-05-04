package test02;



public class RabbitBirth {

	public static void main(String[] args) {
		int rab=1;
		int rabbit[]=new int[20];
		for(int i=1;i<20;i++) {
			if(i<3) {
				
				rabbit[i]=rab;
			}
			else {
				rabbit[i]=rabbit[i-1]+rabbit[i-2];
			}
			System.out.println("第"+i+"天有"+rabbit[i]+"只兔子");
		}

	}

}

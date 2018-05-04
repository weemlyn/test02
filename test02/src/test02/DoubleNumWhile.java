package test02;

public class DoubleNumWhile {

	public static void main(String[] args) {
		int i=1;
		int d=0;
		while(i<=100) {
			int a=i%2;
			int b=i%10;
			if(a==0) {
				
				d+=i;
				
				System.out.print(i+"\t");
				
			}
			if(b==0) {
				System.out.println("");
			}
			
			i++;
			
		}
		System.out.println("偶数和为："+d);

	}

}

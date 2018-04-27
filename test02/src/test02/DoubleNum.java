package test02;

public class DoubleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=0;i<=100;i++) {
    	 int a=i%2;
    	 int b=i%10;
    	 if(a==0) {
    		 System.out.print(i+"\t");
    	 }
    	 if(b==0) {
    		 System.out.println("");
    	 }
      }
	}

}

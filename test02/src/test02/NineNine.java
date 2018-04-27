/**
 * author@weemyn
 */
package test02;

public class NineNine {

	public static void main(String[] args) {
		
        
        for(int i = 1;i<10;i++) {
        	for(int j = 1;j<10;j++) {
        		int n=i*j;
        		if(i>=j) {
        			System.out.print(i+"*"+j+"="+n+"\t");
        		}
        		if(j==9) {
        				System.out.println("");
        			

        		}
        		
        	}
        	
        }

	}

}

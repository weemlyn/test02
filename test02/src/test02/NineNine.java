/**
 * author@weemyn
 */
package test02;

public class NineNine {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j + "*" + i + "=" + (i * j) + "\t");

			}
			System.out.println("");

		}
		System.out.println("-----------------------------------------------");
		int m=1;
		while(m<10) {
			int n=1;
			while(n<=m) {
				System.out.print(n + "*" + m + "=" + (n * m) + "\t");
				n++;
			}
			System.out.println("");
			m++;

		}
		
	}

}

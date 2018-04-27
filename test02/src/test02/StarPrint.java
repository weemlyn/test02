/**
 * author @ weemlyn
 */
package test02;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j < i) {
					System.out.print("*");

				}
				if (j == 9) {
					System.out.println("*");
				}
			}
		}

	}

}

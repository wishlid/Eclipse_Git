package forStudy;

public class ForBox {

	public static void main(String[] args) {
		drawBox();
		drawTri();
	}

	private static void drawBox() {
		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**

	*
	**
	***
	****
	*****

	 */
	private static void drawTri() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	private static void draw() {
		for (int i = 0; i < 10; i++) {
			for (int j = 19; j <= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	/**

	*****
	****
	***
	**
	*

	 */

	/**
	 * *********
	 * *       *
	 * *       *
	 * *********
	 */

}

package forStudy;

public class ForMultiply4Fun {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = i; j <= i + 7; j++) {
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
		}
	}

}

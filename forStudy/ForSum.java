package forStudy;

public class ForSum {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1에서 100 까지 더한 값은 " + sum);
	}

}

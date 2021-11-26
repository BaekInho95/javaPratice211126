package factorial;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(Factorial.factorial(7));

	}

	private static int factorial(int num) {
		int sum = 1;
		for(int i = 2; i<=num;i++) {
			sum = sum * i;
		}
		return sum;
	}

}

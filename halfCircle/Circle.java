package halfCircle;

public class Circle {

	final static int N = 9;

	public static void main(String[] args) {

		for (int i = -N; i <= N; i++) {
			for (int j = -N; j <= N; j++) {
				if (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(N, 2)) {
					System.out.print('*');
				} 
			}
			System.out.println();
		}

	}

}

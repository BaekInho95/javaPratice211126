package array;

public class Arrays {

	public static void main(String[] args) {

		int[][] arr = new int[6][6];
		int i, j;
		int n = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				n++;
				arr[i][j] = n;
			}
		}
		
		int sum = 0;

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("[" + arr[i][j] + "]");
				sum = sum + arr[i][j];
				arr[5][j] += arr[i][j];
			}
			System.out.print("[" + sum + "]");
			sum = 0;
			System.out.println();

		}

	}

}

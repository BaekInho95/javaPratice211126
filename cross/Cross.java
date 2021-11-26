package cross;

public class Cross {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				if ((i == 0 || i == 1 || i == 2 || i == 7 || i == 8 || i == 9) 
						&& (j == 0 || j == 1 || j == 2 || j == 7 || j == 8 || j == 9)) {
					
					System.out.print(' ');
				}else {
					System.out.print('*');
				}

			}
			System.out.println();
		}

	}

}

package sort;

public class SortSystem {

	void method(int[] arrays) {

		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length; j++) {
				if (arrays[i] < arrays[j]) {
					int temp = arrays[i];
					arrays[i] = arrays[j];
					arrays[j] = temp;
				}
			}
		}
		System.out.println(arrays[1]);
		System.out.println("결과");
		for(int i : arrays) {
			System.out.print(i+" ");
		}
	}
}

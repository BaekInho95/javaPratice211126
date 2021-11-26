package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sort {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = null;
		
		System.out.print("배열의 길이를 입력해주세요");

		int n = Integer.parseInt(br.readLine());

		int[] arrays = new int[n];
		
		System.out.print("숫자를 입력해주세요 ex)10 20 30 40 50");

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arrays[i] = Integer.parseInt(st.nextToken());
		}
		
		SortSystem ss = new SortSystem();
		
		ss.method(arrays);
		

	}

}

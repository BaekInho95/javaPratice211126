package rock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rock {

	public static void main(String[] args) throws IOException {
		System.out.println("가위, 바위, 보 중 하나 입력");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String user = br.readLine();
		
		int num = 0;
		
		if(user.equals("가위")) {
			num = 1;
		}else if(user.equals("바위")) {
			num = 2;
		}else if(user.equals("보")) {
			num = 3;
		}
		
		System.out.println("you : " + user);
		String computer = null;
		
		int computerNum = (int) (Math.random() *3) + 1;
		
		if(computerNum == 1) {
			computer = "가위";
		}
		else if(computerNum == 2) {
			computer = "바위";
		}
		else if(computerNum == 3) {
			computer = "보";
		}
		System.out.println("computer : " + computer);

		switch(num-computerNum) {
		case 2: case-1:
			System.out.println("loose");
			break;
		case 1: case-2:
			System.out.println("win");
			break;
		case 0:
			System.out.println("draw");
			break;
		}
		
	}

}

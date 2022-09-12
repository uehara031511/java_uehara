package course12;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn =new Scanner(System.in);

		int yy = stdIn.nextInt();

		for(int i = 0; i < yy; i++) {
		if(i % 2 == 1) {
			System.out.println("奇数だよ");
		}if(i % 2 == 0) {
			System.out.println("偶数だよ");
		}if(i > 100) {
			System.out.println("どれだけ回すの");
		}
		System.out.println(i);
		}
	}

}

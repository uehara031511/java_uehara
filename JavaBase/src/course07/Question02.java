package course07;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);

		int numnum = stdIn.nextInt();
		switch(numnum) {
		case 1:
			System.out.println("1ですね？");
			break;
		case 2:
			System.out.println("2ですね？");
			break;
		default:
			System.out.println("該当なし");
		}
	}

}

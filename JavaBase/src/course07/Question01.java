package course07;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);

		String like = stdIn.next();

		switch(like){
		case "野菜":
			System.out.println("健康的ですね");
			break;
		case "肉":
			System.out.println("肉派ですね");
			break;
		default:
			System.out.println("魚派ですね");
		}
	}
}

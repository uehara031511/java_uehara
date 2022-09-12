package Bugs;

import java.util.Scanner;

public class Bug08 {
	public static void main(String[] args) {
		//数値を2回入力し、その合計が表示されればクリア
		int x = 0;
		int y = 0;
		int z = x + y;

		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を2回入力してね");

		System.out.println("1回目の入力");
		x = stdIn.nextInt();

		System.out.println("2回目の入力");
		y = stdIn.nextInt();

		System.out.println("合計は" + z +"です");
	}
}

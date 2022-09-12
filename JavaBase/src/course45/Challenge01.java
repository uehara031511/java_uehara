package course45;

import java.util.Random;
import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int money = 1000;

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			i = 0;
			System.out.println("掛け金を入力");
			int kake = stdIn.nextInt();
			if (kake > money) {
				System.out.println("掛け金を入力しなおしてください");
			} else {
				int a = random.nextInt(6) + 1;
				int b = random.nextInt(6) + 1;
				int c = random.nextInt(7) + 1;

				System.out.println(a);
				System.out.println(b);
				System.out.println(c);

				if (i == 0 && a == 1 && b == 1 && c == 1) {
					money = money + kake * 5;
					System.out.println("ピンゾロ");
					i = i + 1;
				}


				if (i == 0 && a == b && b == c && a != 1 && c != 7) {
					money = money + kake * 3;
					System.out.println("ゾロ目");
					i = i + 1;
				}


				if (i == 0 && a == 4 && b == 5 && c == 6) {
					money = money + kake * 2;
					System.out.println("シゴロ");
					i = i + 1;
				}
				if (i == 0 && a == 4 && b == 6 && c == 5) {
					money = money + kake * 2;
					System.out.println("シゴロ");
					i = i + 1;
				}
				if (i == 0 && a == 5 && b == 4 && c == 6) {
					money = money + kake * 2;
					System.out.println("シゴロ");
					i = i + 1;
				}
				if (i == 0 && a == 5 && b == 6 && c == 4) {
					money = money + kake * 2;
					System.out.println("シゴロ");
					i = i + 1;
				}
				if (i == 0 && a == 6 && b == 4 && c == 5) {
					money = money + kake * 2;
					System.out.println("シゴロ");
					i = i + 1;
				}
				if (i == 0 && a == 6 && b == 5 && c == 4) {
					money = money + kake * 2;
					System.out.println("シゴロ");
					i = i + 1;
				}


				if (i == 0 && a == b && a != c && c != 7) {
					System.out.println("通常の目");
					i = i + 1;
				}
				if (i == 0 && a == c && a != b && c != 7) {
					System.out.println("通常の目");
					i = i + 1;
				}
				if (i == 0 && b == c && a != b && c != 7) {
					System.out.println("通常の目");
					i = i + 1;
				}


				if (i == 0 && c == 7) {
					money = money - kake;
					System.out.println("ションベン！！！");
					i = i + 1;
				}

				if (i == 0 && a != b && b != c && a != c && c != 7) {
					if (a == 1 && b == 2 && c == 3) {
						money = money - kake * 2;
						System.out.println("ヒフミ");
						i = i + 1;
				}
					if (a == 1 && b == 3 && c == 2) {
						money = money - kake * 2;
						System.out.println("ヒフミ");
						i = i + 1;
				}
					if (a == 2 && b == 1 && c == 3) {
						money = money - kake * 2;
						System.out.println("ヒフミ");
						i = i + 1;
				}
					if (a == 2 && b == 3 && c == 1) {
						money = money - kake * 2;
						System.out.println("ヒフミ");
						i = i + 1;
				}
					if (a == 3 && b == 1 && c == 2) {
						money = money - kake * 2;
						System.out.println("ヒフミ");
						i = i + 1;
				}
					if (a == 3 && b == 2 && c == 1) {
						money = money - kake * 2;
						System.out.println("ヒフミ");
						i = i + 1;
				}
					money = money - kake;
					System.out.println("役なし");
					i = i + 1;
				}


				System.out.println("現在の所持金は" + money + "です");
				System.out.println("");
				i = 0;
				if (money >= 5000) {
					i = 100;
					System.out.println("クリア");
				}
				if (money <= 0) {
					i = 100;
					System.out.println("ゲームオーバー");
				}

			}

		}
		System.out.println("終了");

	}

}

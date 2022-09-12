package course39;

import java.util.Random;
import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int win = 0;
		int lose = 0;
		int game = 0;
		Scanner stdIn = new Scanner(System.in);

		int money = 1000;
		System.out.println("あなたの現在の所持金は" + money + "です。");
		for (int x = 0; x != 9999;) {

			Random random = new Random();
			int a = random.nextInt(12) + 1;
			System.out.println("cpu1回目の数値" + a);
			int b = random.nextInt(12) + 1;
			System.out.println("cpu2回目の数値" + b);

			System.out.println("");

			int c = random.nextInt(12) + 1;
			System.out.println("player1回目の数値" + c);

			System.out.println("");


			System.out.println("高いか低いか予想してください");
			System.out.println("1:高い   2:低い");
			int y = stdIn.nextInt();

			System.out.println("掛け金を入力してください。");

			int kake = stdIn.nextInt();


			if(kake > money) {
				System.out.println("所持金より多く掛けられません");
				System.out.println("やり直します");
			}else {
				if(y == 1) {

			int d = random.nextInt(12) + 1;
			System.out.println("player2回目の数値" + d);

			System.out.println("");

			int cpu = a + b;
			int player = c + d;

			System.out.println("cpuの合計:"+ cpu);
			System.out.println("playerの合計:"+ player);

			System.out.println("");

			if (cpu > player) {
				money = money - kake;
				System.out.println("あなたの負けです。");
				System.out.println("あなたの現在の所持金は" + money + "です。");
				lose = lose + 1;
			}
			if (cpu < player) {
				money = (money - kake) + (kake * 2);
				System.out.println("あなたの勝ちです。");
				System.out.println("あなたの現在の所持金は" + money + "です。");
				win = win + 1;
			}
			if (cpu == player) {
				System.out.println("引き分けです。");
				System.out.println("あなたの現在の所持金は" + money + "です。");
			}
		}

			if(y == 2) {
				if(kake > money) {
					System.out.println("所持金より多く掛けられません");
					System.out.println("やり直します");
				}else {

				int d = random.nextInt(12) + 1;
				System.out.println("player2回目の数値" + d);

				System.out.println("");

				int cpu = a + b;
				int player = c + d;

				System.out.println("cpuの合計:"+ cpu);
				System.out.println("playerの合計:"+ player);

				System.out.println("");

				if (cpu < player) {
					money = money - kake;
					System.out.println("あなたの負けです。");
					System.out.println("あなたの現在の所持金は" + money + "です。");
					lose = lose + 1;
				}
				if (cpu > player) {
					money = (money - kake) + (kake * 2);
					System.out.println("あなたの勝ちです。");
					System.out.println("あなたの現在の所持金は" + money + "です。");
					win = win + 1;
				}
				if (cpu == player) {
					System.out.println("引き分けです。");
					System.out.println("あなたの現在の所持金は" + money + "です。");
				}
			}
		}
			game = game + 1;

			System.out.println("");

			System.out.println("やめる場合は9999を入力");
			System.out.println("続ける場合はそれ以外を入力");

			x = stdIn.nextInt();

			if(money <= 0) {
				x = 9999;
				System.out.println("借金ダメ絶対");
				System.out.println("強制終了します");
			}
		}
	}
		dispResult(game, win, lose);

	}
	static void dispResult(int e, int f,int g) {
		System.out.println("行ったゲーム数" + e + "回です");
		System.out.println("勝利数" + f + "回です");
		System.out.println("敗北数" + g + "回です");
	}
}

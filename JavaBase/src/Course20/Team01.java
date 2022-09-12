package Course20;

import java.util.Random;
import java.util.Scanner;

public class Team01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//配列の作成
		int[][] panelBoard = new int[5][6];
		Random rand = new Random();

		//配列の中身を全てランダムな数字にする。
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				//1-6までのランダムな数字を取得するプログラム
				int randNumber = rand.nextInt(6) + 1;
				panelBoard[i][j] = randNumber;
			}
		}

		//今の配列中身表示
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(panelBoard[i][j]);
			}
			System.out.println("");
		}

		//author isono
		Scanner a = new Scanner(System.in);
		System.out.println("移動元の数値[縦]");
		int b = a.nextInt();
		System.out.println("移動元の数値[横]");
		int c = a.nextInt();

		System.out.println("移動先の数値[縦]");
		int d = a.nextInt();
		System.out.println("移動先の数値[横]");
		int e = a.nextInt();

		int[][] mo = new int[1][1];

		//入れ替え
		mo[0][0] = panelBoard[b][c];
		panelBoard[b][c] = panelBoard[d][e];
		panelBoard[d][e] = mo[0][0];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(panelBoard[i][j]);
			}
			System.out.println("");
		}
		int point = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (panelBoard[i][j] == panelBoard[i][j + 1] && panelBoard[i][j] == panelBoard[i][j - 1]) {
					System.out.println("横揃った 1点追加!!");
					point = point + 1;
				}
			}
		}

		System.out.println("横判定終わり");

		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				if (panelBoard[i][j] == panelBoard[i + 1][j] && panelBoard[i][j] == panelBoard[i - 1][j]) {
					System.out.println("縦揃った 1点追加!!");
					point = point + 1;
				}

			}
		}
		System.out.println("合計点は"+ point +"点だ!!");
	}

}

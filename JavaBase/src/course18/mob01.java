package course18;

import java.util.Scanner;

public class mob01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner a = new Scanner(System.in);
		System.out.println("乗車駅を入力　0:稲毛 1:西千葉 2:千葉");
		int x = a.nextInt();
		System.out.println("降車駅を入力　0:稲毛 1:西千葉 2:千葉");
		int y = a.nextInt();

		int[][] ox = new int[3][3];

		ox[0][0] = 0;
		ox[0][1] = 140;
		ox[0][2] = 160;

		ox[1][0] = 170;
		ox[1][1] = 0;
		ox[1][2] = 180;

		ox[2][0] = 190;
		ox[2][1] = 200;
		ox[2][2] = 0;

		System.out.println("運賃は" + ox[x][y]);

	}
}

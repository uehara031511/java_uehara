package Ensyu2;

import java.util.Scanner;

public class Ensyu3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		String[] diary = new String[31];

		diary[0] = "";
		diary[1] = "";
		diary[2] = "";
		diary[3] = "";
		diary[4] = "";
		diary[5] = "";
		diary[6] = "";
		diary[7] = "";
		diary[8] = "";
		diary[9] = "";
		diary[10] = "";
		diary[11] = "";
		diary[12] = "";
		diary[13] = "";
		diary[14] = "";
		diary[15] = "";
		diary[16] = "";
		diary[17] = "";
		diary[18] = "";
		diary[19] = "";
		diary[20] = "";
		diary[21] = "";
		diary[22] = "";
		diary[23] = "";
		diary[24] = "";
		diary[25] = "";
		diary[26] = "";
		diary[27] = "";
		diary[28] = "";
		diary[29] = "";
		diary[30] = "";

		for (int i = 0; i < 10;) {
			System.out.println("1:日報入力  2:日報閲覧  99:終了");
			int a = stdIn.nextInt();

			if (a == 1) {
				System.out.println("日付を入力 (日にちのみ)");
				int b = stdIn.nextInt();
				System.out.println("日報を入力");
				diary[b-1] = stdIn.next();
				i = 0;

			} else if (a == 2) {
				for(int u = 0; u < diary.length; u++)
				System.out.println(u+1 + "日: " +diary[u]);
				i = 0;

			} else if (a == 99) {
				System.out.println("終了します。");
				i = 10;
			}

		}
	}
}

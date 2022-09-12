package Ensyu2;

import java.util.Scanner;

public class Ensyu2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1:足し算  2:引き算  3:掛け算  4;割り算");
		int a = stdIn.nextInt();

		System.out.println("計算したい数値を入力");
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();

		int total = 0;

		if (a == 1) {
			total = tasu(x, y);
		} else if (a == 2) {
			total = hiku(x, y);
		} else if (a == 3) {
			total = kake(x, y);
		} else if (a == 4) {
			total = waru(x, y);
		} else if(a > 4 || a < 1) {
			System.out.println("やり直せおたんこなす");
		}

		System.out.println("計算結果は"+ total +"です");
	}

		static int tasu(int o, int p) {
			return o + p;
	}
		static int hiku(int o, int p) {
			return o - p;
		}
		static int kake(int o, int p) {
			return o * p;
		}
		static int waru(int o, int p) {
			return o / p;
		}
}

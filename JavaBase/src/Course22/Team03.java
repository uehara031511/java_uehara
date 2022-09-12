package Course22;

import java.util.Scanner;

public class Team03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("計算する数値を2つ入力してね");
		int x =stdIn.nextInt();
		System.out.println("計算する数値を2つ入力してね2つ目");
		int y =stdIn.nextInt();

		System.out.println("足し算なら1,引き算なら2");
		int z = stdIn.nextInt();

		//入力されたメニューによって呼び出しメソッドを変更
		int result = 0;
		if(z <= 4) {
			result = tasi(x,y);
		}

		System.out.println("計算結果は" + result);
	}

	static int tasi(int x , int y) {
		int result2 = 0;
		System.out.println("計算結果は" + result2);

		//メニュー再選択
		Scanner stdIn2 = new Scanner(System.in);
		System.out.println("メニューを入力してね（今足し算メソッドの中にいるよ）");
		int z = stdIn2.nextInt();

		int result = 0;
		if(z == 1) {
			result =x + y;
		} else if(z == 2) {
			result =x - y;
		} else if(z == 3) {
			result =x * y;
		} else if(z == 4) {
			result =x / y;
		} else if(z == 5) {
			return result;
		}
		return result;
	}

}

package Course22;

import java.util.Scanner;

public class Team01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("計算する数値を2つ入力してね");
		int x =stdIn.nextInt();
		System.out.println("計算する数値を2つ入力してね2つ目");
		int y =stdIn.nextInt();

		System.out.println("足し算なら1,引き算なら2");
		System.out.println("掛け算なら3,割り算なら4");
		int z = stdIn.nextInt();

		//入力されたメニューによって呼び出しメソッドを変更
		int result = 0;
		if(z == 1) {
			result = tasi(x,y);
		} else if(z == 2) {
			result = hiki(x,y);
		} else if(z == 3) {
			result = kake(x,y);
		} else if(z == 4) {
			result = wari(x,y);
		}

		System.out.println("計算結果は" + result);
	}

	static int tasi(int x , int y) {
		return x + y;
	}
	static int hiki(int x , int y) {
		return x - y;
	}
	static int kake(int x , int y) {
		return x * y;
	}
	static int wari(int x , int y) {
		return x / y;
	}

}
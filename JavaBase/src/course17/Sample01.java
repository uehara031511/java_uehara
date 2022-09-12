package course17;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してね");

		int x = stdIn.nextInt();

		int[] arr = new int[5];

		arr[0] = 50;
		arr[1] = 20;
		arr[2] = x;
		arr[3] = 30;
		arr[4] = 10;

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("合計値は" + sum + "です。");
	}

}

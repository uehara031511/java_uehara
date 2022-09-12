package Course22;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		int total = calc2(a, b);
		System.out.println(total);
	}

	static int calc2(int x, int y) {
		return x + y;
	}
}

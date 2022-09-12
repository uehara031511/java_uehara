package Course21;

import java.util.Scanner;

public class 応用01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1:足し算  2:引き算");
		
		int a = stdIn.nextInt();
		
		System.out.println("計算したい数値を入力");
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(a == 1) {
			plus(b,c);
		}if(a == 2) {
			minus(b,c);
		}
	}

		static void plus(int o ,int p) {
			System.out.println(o + p);
		}
		
		static void minus(int q,int r) {
			System.out.println(q - r);
		}
}

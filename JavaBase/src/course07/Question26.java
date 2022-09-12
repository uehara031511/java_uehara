package course07;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(x>y) {
			System.out.println(x + "の方が大きいです。");
		}else {
			System.out.println(x + "の方が小さいです");
		}
	}

}

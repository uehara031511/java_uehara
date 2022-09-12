package course04;

import java.util.Scanner;

public class 応用Question02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);

		System.out.print("num1:");
		int num1=stdIn.nextInt();

		System.out.print("num2:");
		int num2=stdIn.nextInt();

		System.out.print("moji1:");
		String moji1=stdIn.next();

		System.out.println("あなたは数字の"+ num1 +"と"+ num2 + "を入力しました。文字列は"+ moji1 +"です。");
	}

}

package Bugs;

import java.util.Scanner;

public class Bug07 {
	public static void main(String[] args) {
		//文字列を入力し、入力した文字列が表示されればクリア

		System.out.println("文字列を入力してね");
		Scanner stdIn = new Scanner(System.in);
		String x = stdIn.next();
		System.out.println("あなたが入力したのは" + x +"ですね？");
		stdIn.close();
	}
}

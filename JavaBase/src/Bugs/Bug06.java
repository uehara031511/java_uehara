package Bugs;

import java.util.Scanner;

public class Bug06 {
	public static void main(String[] args) {
		//数値を入力し、入力した数値が表示されればクリア
		System.out.println("数値を入力してね");
		Scanner stdIn = new Scanner(System.in);
		String x = stdIn.next();
		System.out.println("あなたが入力したのは" + x +"ですね？");
		stdIn.close();
	}
}

package sougou01;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("偶数の値を入力してください");
		int x = stdIn.nextInt();
		
		for(int i = 0; i < x; i++) {
			System.out.print("■");
		}System.out.print("");
	}

}

package Bugs;

import java.util.Scanner;

public class Bug13 {
	public static void main(String[] args) {
		//正しく動けばOK
		Scanner stdIn = new Scanner(System.in);
		System.out.println("あなたの血液型を入力して下さい。");
		System.out.println("A型ならAのように半角で入力する事");
		String bloodType = stdIn.next();

		switch(bloodType) {
			case "A":
				System.out.println("几帳面？");
				break;
			case "B":
				System.out.println("マイペース？");
				break;
			case "O":
				System.out.println("おおらか？");
			case "AB":
				System.out.println("几帳面でマイペース？");
				break;
			default:
				System.out.println("default?");
		}
	}
}

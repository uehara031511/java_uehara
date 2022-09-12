package course07;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("誕生月を入力してね。例：3月なら「3」と入力。");
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();
		
		if(month==1 || month==2 || month==3) {
			System.out.println("大吉");}
		if(month==4 || month==5 || month==6) {
			System.out.println("中吉");}
		if(month==7 || month==8 || month==9) {
			System.out.println("小吉");}
		if(month==10 || month==11 || month==12) {
			System.out.println("末吉");
		}
	}

}

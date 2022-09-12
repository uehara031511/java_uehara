package course07;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("曜日を入力しやがれください");
		System.out.println("日曜から順に1.2.3  土曜は7");
		int x = stdIn.nextInt();
		
		if(x==1 || x==3 || x==6) {
			System.out.println("予約できません");}
		if(x==2 || x==4 || x==5 || x==7) {
			System.out.println("予約できます");
		}
	}

}

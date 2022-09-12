package course07;

import java.util.Scanner;

public class Question210 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("時間と曜日を入力しやがれください");
		System.out.println("午前は 1 午後は 2 夜間は 3");
		System.out.println("日曜から順に1.2.3  土曜は7");
		int a = stdIn.nextInt();
		int x = stdIn.nextInt();

		if(x==1) {
			System.out.println("予約できません");}
		if(x==1 || x==3 || x==6) {
			System.out.println("予約できません");}
		if(x==2 || x==4 || x==5 || x==7) {
			System.out.println("予約できます");
	}

}
}

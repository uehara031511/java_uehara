package course07;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("住んでいる都道府県と年齢を入力してね。千葉県は「1」北海道は「2」京都府は「3」");
		System.out.println("都道府県:");
		System.out.println("年齢:");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(x==1 && y<=18) {
			System.out.println("国際理工学園に入学しよう！");}
		if(x==1 && y>=19 && y<=29) {
			System.out.println("まだまだこれから！国際理工学園に入学しよう！");}
		if(x==1 && y>=30 && y<=60) {
			System.out.println("お世話になっております。本校の優秀な学生を御社にぜひ！");}
		if(x==1 && y>=61) {
			System.out.println("該当なし");}
		if(x==2 && y<=18) {
			System.out.println("北海道民ってBBQしまくりってまじですか？");}
		if(x==2 && y>=19 && y<=29) {
			System.out.println("ぜひ千葉県の企業に就職してください！");}
		if(x==2 && y>=30 && y<=60) {
			System.out.println("お世話になっております。本校の優秀な学生を御社にぜひ！");}
		if(x==2 && y>=61) {
			System.out.println("該当なし");}
		if(x==3 && y<=18) {
			System.out.println("京都はいい所ですよね！");}
		if(x==3 && y>=19 && y<=29) {
			System.out.println("オススメの観光スポットを教えてください。");}
		if(x==3 && y>30 && y<=60) {
			System.out.println("お世話になっております。本校の優秀な学生を御社にぜひ！");}
		if(x==3 && y>=61) {
			System.out.println("該当なし");
		}
		
		

	}

		}

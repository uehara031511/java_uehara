package sougou01;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報を選んでください。");
		System.out.println("1:台風件数  2:地震件数  3:降水量");
		int x = stdIn.nextInt();

		System.out.println("年別か月別か選んでください。1:年別  2:月別");
		int y = stdIn.nextInt();


		if(x == 1 && y == 1) {
			System.out.println("1年間に起こった台風の件数は29件です。");
		}
		if(x == 2 && y == 1) {
			System.out.println("1年間に起こった地震の件数は1505件です。");
		}
		if(x == 3 && y == 1) {
			System.out.println("1年間の降水量は1694mmです。");
		}



		if(y == 2) {
			System.out.println("見たい月を選んでください。");
		}
		int z = stdIn.nextInt();



		if(x == 1 && y == 2 && z == 1) {
			System.out.println("1月の台風件数は1件です。");
		}if(x == 1 && y == 2 && z == 2) {
			System.out.println("2月の台風件数は1件です。");
		}if(x == 1 && y == 2 && z == 3) {
			System.out.println("3月の台風件数は0件です。");
		}if(x == 1 && y == 2 && z == 4) {
			System.out.println("4月の台風件数は0件です。");
		}if(x == 1 && y == 2 && z == 5) {
			System.out.println("5月の台風件数は0件です。");
		}if(x == 1 && y == 2 && z == 6) {
			System.out.println("6月の台風件数は1件です。");
		}if(x == 1 && y == 2 && z == 7) {
			System.out.println("7月の台風件数は4件です。");
		}if(x == 1 && y == 2 && z == 8) {
			System.out.println("8月の台風件数は5件です。");
		}if(x == 1 && y == 2 && z == 9) {
			System.out.println("9月の台風件数は6件です。");
		}if(x == 1 && y == 2 && z == 10) {
			System.out.println("10月の台風件数は4件です。");
		}if(x == 1 && y == 2 && z == 11) {
			System.out.println("11月の台風件数は6件です。");
		}if(x == 1 && y == 2 && z == 12) {
			System.out.println("12月の台風件数は1件です。");
		}



		if(x == 2 && y == 2 && z == 1) {
			System.out.println("1月の地震件数は153件です。");
		}		if(x == 2 && y == 2 && z == 2) {
			System.out.println("2月の地震件数は127件です。");
		}		if(x == 2 && y == 2 && z == 3) {
			System.out.println("3月の地震件数は130件です。");
		}		if(x == 2 && y == 2 && z == 4) {
			System.out.println("4月の地震件数は109件です。");
		}		if(x == 2 && y == 2 && z == 5) {
			System.out.println("5月の地震件数は118件です。");
		}		if(x == 2 && y == 2 && z == 6) {
			System.out.println("6月の地震件数は164件です。");
		}		if(x == 2 && y == 2 && z == 7) {
			System.out.println("7月の地震件数は130件です。");
		}		if(x == 2 && y == 2 && z == 8) {
			System.out.println("8月の地震件数は103件です。");
		}		if(x == 2 && y == 2 && z == 9) {
			System.out.println("9月の地震件数は103件です。");
		}		if(x == 2 && y == 2 && z == 10) {
			System.out.println("10月の地震件数は104件です。");
		}		if(x == 2 && y == 2 && z == 11) {
			System.out.println("11月の地震件数は123件です。");
		}		if(x == 2 && y == 2 && z == 12) {
			System.out.println("12月の地震件数は141件です。");
		}


		if(x == 3 && y == 2 && z == 1) {
			System.out.println("1月の降水量は20mmです。");
		}
		if(x == 3 && y == 2 && z == 2) {
			System.out.println("2月の降水量は58mmです。");
		}
		if(x == 3 && y == 2 && z == 3) {
			System.out.println("3月の降水量は107mmです。");
		}
		if(x == 3 && y == 2 && z == 4) {
			System.out.println("4月の降水量は87mmです。");
		}
		if(x == 3 && y == 2 && z == 5) {
			System.out.println("5月の降水量は114mmです。");
		}
		if(x == 3 && y == 2 && z == 6) {
			System.out.println("6月の降水量は187mmです。");
		}
		if(x == 3 && y == 2 && z == 7) {
			System.out.println("7月の降水量は200mmです。");
		}
		if(x == 3 && y == 2 && z == 8) {
			System.out.println("8月の降水量は59mmです。");
		}
		if(x == 3 && y == 2 && z == 9) {
			System.out.println("9月の降水量は169mmです。");
		}
		if(x == 3 && y == 2 && z == 10) {
			System.out.println("10月の降水量は441mmです。");
		}
		if(x == 3 && y == 2 && z == 11) {
			System.out.println("11月の降水量は158mmです。");
		}
		if(x == 3 && y == 2 && z == 12) {
			System.out.println("12月の降水量は94mmです。");
		}

	}}


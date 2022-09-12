package course07;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int z = stdIn.nextInt();
		
		if(x>y && y>z) {
			System.out.println(x + "が一番大きい数値です");
			System.out.println(y + "が二番目に大きい数値です");
			System.out.println(z + "が三番目に大きい数値です");}
		if(x>z && z>y) {
			System.out.println(x + "が一番大きい数値です");
			System.out.println(z + "が二番目に大きい数値です");
			System.out.println(y + "が三番目に大きい数値です");}
		if(z>y && y>x) {
			System.out.println(z + "が一番大きい数値です");
			System.out.println(y + "が二番目に大きい数値です");
			System.out.println(x + "が三番目に大きい数値です");}
		if(z>x && x>y) {
			System.out.println(z + "が一番大きい数値です");
			System.out.println(x + "が二番目に大きい数値です");
			System.out.println(y + "が三番目に大きい数値です");}
		if(y>x && x>z) {
			System.out.println(y + "が一番大きい数値です");
			System.out.println(x + "が二番目に大きい数値です");
			System.out.println(z + "が三番目に大きい数値です");}
		if(y>z && z>x) {
			System.out.println(y + "が一番大きい数値です");
			System.out.println(z + "が二番目に大きい数値です");
			System.out.println(x + "が三番目に大きい数値です");
		}
	}

}

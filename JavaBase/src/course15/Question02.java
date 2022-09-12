package course15;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int[] numArray = new int[5];

		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = stdIn.nextInt();
		numArray[3] = 40;
		numArray[4] = 50;
		
		
		System.out.println("0番目のハコの中身は"+ numArray[0]);
		
		System.out.println("1番目のハコの中身は"+ numArray[1]);
		
		System.out.println("2番目のハコの中身は"+ numArray[2]);
		
		System.out.println("3番目のハコの中身は"+ numArray[3]);
		
		System.out.println("4番目のハコの中身は"+ numArray[4]);
		
	}

}

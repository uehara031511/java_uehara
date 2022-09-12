package course17;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int[] arr = new int[5];

		arr[0] = 50;
		arr[1] = 20;
		arr[2] = stdIn.nextInt();
		arr[3] = 30;
		arr[4] = 10;
		
		int x = 500;
		
		for(int i = 0; i < arr.length; i++) {
			x = x - arr[i];
		}
		System.out.println(x);
	}
}

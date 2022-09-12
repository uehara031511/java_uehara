package course40;

import java.util.ArrayList;
import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int [] a = new int [10];

		a [0] = stdIn.nextInt();
		a [1] = stdIn.nextInt();
		a [2] = stdIn.nextInt();
		a [3] = stdIn.nextInt();
		a [4] = stdIn.nextInt();
		a [5] = stdIn.nextInt();
		a [6] = stdIn.nextInt();
		a [7] = stdIn.nextInt();
		a [8] = stdIn.nextInt();
		a [9] = stdIn.nextInt();


		ArrayList<Integer> arr = new ArrayList<>();


		for(int i = 10; i > 0;) {
			arr.add(a[i-1]);
			i = i - 1;
		}
		for(int i = 10; i > 0;) {
			if(i % 2 != 0) {
				arr.remove(i);
				i = i - 1;
			}
			i = i - 1;
		}
		System.out.println(arr);
	}

}

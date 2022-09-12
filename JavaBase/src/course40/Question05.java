package course40;

import java.util.ArrayList;
import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());
		arr.add(stdIn.nextInt());

		System.out.println(arr);

		int x = arr.size();

		for (int i = 0; i < x;) {
			if(arr.get(i) < 50) {
				arr.remove(i);
				x = arr.size();
			}else {
				i = i + 1;
				x = x - 1;
			}
		}
		System.out.println(arr);

	}
}

package course40;

import java.util.ArrayList;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//リストを作成。
		ArrayList<Integer> arr = new ArrayList<>();

		//リストに値を追加
		arr.add(150);
		arr.add(200);
		arr.add(250);

		//0番目の要素を表示
		System.out.println(arr.get(0));

		//全体を表示
		System.out.println(arr);
	}

}

package course40;

import java.util.ArrayList;

public class Question03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> arr = new ArrayList<>();

		arr.add("リンゴ");
		arr.add("みかん");
		arr.add("いちご");


		int num = arr.size();

		for (int i = 0; i < num; i++) {
			System.out.println(arr.get(i));
		}

	}
}

package course40;

import java.util.ArrayList;

public class Sample05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> arr = new ArrayList<>();
		arr.add("国際");
		arr.add("理工");

		//リストの大きさを取得して変数に代入
		int num = arr.size();

		//リストの要素数分ループしつつ、中身を表示
		for(int i = 0; i < num; i++) {
			System.out.println(arr.get(i));
		}
	}

}

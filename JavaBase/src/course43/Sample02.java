package course43;

import java.util.HashMap;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HashMap<Integer,String> map = new HashMap<>();

		//mapにデータを登録する。
		//必ずキーとバリューをセットで登録。
		map.put(1, "千葉県");
		map.put(2, "京都府");
		map.put(3, "沖縄");

		//登録したデータを使うときは「get」を使う。
		System.out.println("住みたい県第1位" + map.get(1));
		System.out.println("住みたい県第2位" + map.get(2));
	}

}

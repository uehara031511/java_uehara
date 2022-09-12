package course43;

import java.util.HashMap;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HashMap<String,String> map = new HashMap<>();

		//mapにデータを登録する。
		//必ずキーとバリューをセットで登録。
		map.put("千葉", "千葉県");
		map.put("埼玉", "埼玉県");
		map.put("京都", "京都府");

		System.out.println("-----削除前-----");
		System.out.println("住みたい県第2位" + map.get("埼玉"));

		//削除には「remove」を使う。
		map.remove("埼玉");

		System.out.println("-----削除後-----");
		System.out.println("住みたい県第2位" + map.get("埼玉"));
	}

}

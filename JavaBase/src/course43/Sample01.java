package course43;

import java.util.HashMap;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HashMap<String,String> map = new HashMap<>();

		//mapにデータを登録する。
		//必ずキーとバリューをセットで登録。
		map.put("千葉県", "最強");
		map.put("京都府", "したたか");
		map.put("埼玉県", "(笑)");

		//登録したデータを使うときは「get」を使う。
		System.out.println("千葉県の特徴は" + map.get("千葉県") + "なところです");
		System.out.println("京都府の特徴は" + map.get("京都府") + "なところです");
		System.out.println("埼玉県" + map.get("埼玉県"));
	}

}

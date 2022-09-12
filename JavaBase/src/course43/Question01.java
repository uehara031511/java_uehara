package course43;

import java.util.HashMap;

public class Question01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HashMap<String,Integer> price = new HashMap<>();

		price.put("りんご", 250);
		price.put("みかん", 150);

		System.out.println(price.get("りんご"));

		int a = price.get("りんご");
		int b = price.get("みかん");
		int c = a + b;

		System.out.println("りんごとみかんの合計金額は"+ c +"円です。");
	}

}

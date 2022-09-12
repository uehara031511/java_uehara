package course43;

import java.util.HashMap;

public class Question001 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HashMap<String,String> tonari = new HashMap<>();

		tonari.put("名前", "井岡優太");
		tonari.put("趣味", "旅行");
		tonari.put("出身校", "実籾");
		tonari.put("最近うれしかったこと", "友達に「燃費いい走りするね」と褒められたこと");

		System.out.println(tonari.get("名前"));
	}

}

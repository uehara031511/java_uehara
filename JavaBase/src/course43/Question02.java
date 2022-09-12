package course43;

import java.util.HashMap;

public class Question02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HashMap<String, Integer> map = new HashMap<>();

		map.put("牛肉", 950);
		map.put("鶏肉", 750);
		map.put("豚肉", 850);

		System.out.println(map.get("牛肉"));
		System.out.println(map.get("鶏肉"));
		System.out.println(map.get("豚肉"));
	}

}

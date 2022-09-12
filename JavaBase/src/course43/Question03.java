package course43;

import java.util.HashMap;

public class Question03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		String[] fruitArr = {"りんご","ぶどう","みかん"};

		HashMap<String,String[]> fruitMap = new HashMap<>();

		fruitMap.put("popularFruit",fruitArr);

		System.out.println(fruitMap.get("popularFruit")[2]);
	}

}
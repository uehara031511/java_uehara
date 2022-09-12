package course43;

import java.util.ArrayList;
import java.util.HashMap;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> meatList = new ArrayList<>();

		meatList.add("chicken");
		meatList.add("beaf");
		meatList.add("pork");

		HashMap<String,ArrayList> meatMap = new HashMap<>();

		meatMap.put("category",meatList);

		System.out.println(meatMap.get("category"));
	}

}

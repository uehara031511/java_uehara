package course43;

import java.util.HashMap;

public class Sample04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HashMap<String,int[]> map = new HashMap<>();

		//mapにデータを登録する。
		//必ずキーとバリューをセットで登録。
		int[] arr = {10,20,30,40};
		map.put("10の倍数", arr);

		//mapに格納されていたとしても配列の使い方は変わらない。
		System.out.println("5+5は" + map.get("10の倍数")[0]);

	}

}

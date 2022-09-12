package course42;

import java.util.ArrayList;

public class Question12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> a = new ArrayList<>();

		for(int i = 0; i < 3; i++) {
			if(i == 0) {
				a.add("リンゴ");
			}if(i == 1) {
				a.add("みかん");
			}if(i == 2) {
				a.add("いちご");
			}
		}System.out.println(a);
	}

}

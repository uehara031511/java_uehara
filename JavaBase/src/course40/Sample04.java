package course40;

import java.util.ArrayList;

public class Sample04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> arr = new ArrayList<>();
		arr.add("国際");
		arr.add("理工");

		System.out.println("-----削除前のarr.get(0)-----");
		System.out.println(arr.get(0));

		arr.remove(0);

		System.out.println("-----削除後のarr.get(0)-----");
		System.out.println(arr.get(0));
	}

}

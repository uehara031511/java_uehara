package course15;

public class challenge01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] array = new String[8];

		array[0] = "白";
		array[1] = "黒";
		array[2] = "黒";
		array[3] = "黒";
		array[4] = "黒";
		array[5] = "黒";
		array[6] = "白";
		array[7] = "黒";


		if("黒".equals(array[7])) {
			System.out.println("黒の勝利です");
		}else {
			System.out.println("白の勝利です");
		}
	}
}

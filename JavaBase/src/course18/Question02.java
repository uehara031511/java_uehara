package course18;

public class Question02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] ox = new String[3][3];

		ox[0][0] = "o";
		ox[0][1] = "x";
		ox[0][2] = "o";

		ox[1][0] = "x";
		ox[1][1] = "o";
		ox[1][2] = "x";

		ox[2][0] = "o";
		ox[2][1] = "o";
		ox[2][2] = "o";

		int k = 0;
		for (int i = 0; i < ox.length; i++) {
			for (int j = 0; j < ox.length; j++) {
				if ("o".equals(ox[i][j])) {
					k++;
				}
			}

		}
		System.out.println(k + "個");
	}
}

package course18;

public class Question01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] ox = new String[3][3];
		
		ox [0][0] = "o";
		ox [0][1] = "x";
		ox [0][2] = "o";
		
		ox [1][0] = "x";
		ox [1][1] = "o";
		ox [1][2] = "x";
		
		ox [2][0] = "o";
		ox [2][1] = "o";
		ox [2][2] = "o";
		
		for(int i = 0; i < ox.length; i++) {
			System.out.println(ox[2][i]);
		}
	}

}

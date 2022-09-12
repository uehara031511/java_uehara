package Bugs;

public class Bug12 {
	public static void main(String[] args) {
		//以下の条件と合致する場合に「クリア」と表示できればクリア
		//条件1:xが50以上
		//条件2:yが100以下
		int x = 55;
		int y = 95;

		if(x >= 50 && y<= 100) {
			System.out.println("クリア");
		}
	}
}

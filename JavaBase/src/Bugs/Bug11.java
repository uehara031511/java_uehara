package Bugs;

public class Bug11 {
	public static void main(String[] args) {
		//xが30より大きいなら「大きい」と表示し、そうでないなら「小さい」と表示するように。
		int x = 0;
		if(x < 30) {
			System.out.println("小さい");
		} else {
			System.out.println("大きい");
		}
	}
}

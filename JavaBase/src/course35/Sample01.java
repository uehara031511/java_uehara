package course35;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		calc();

		calc(50, 100);




		calc("ここっこ");

		calc(0.5);

	}

	static void calc() {
		System.out.println("計算をしたいときは、引数を2つ渡して");
	}

	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));
	}



	static void calc(String c) {
		System.out.println("渡された文字は"+ c +"です");
	}

	static void calc(double v) {
		System.out.println("受け取った値は"+ v +"です");
	}
}
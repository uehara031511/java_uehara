package course34;

public class UseClass {
	public static void main(String[] args) {

		//インスタンスの生成
		Human human = new Human();
		//パラメータの設定

		// name(人間）
		human.setName("人間");
		// simei 好きに設定
		human.setSimei("卓郎");
		// hobby　好きに設定
		human.setHobby("館探索");
		// weight　好きに設定
		human.setWeight(19000);

		//eatメソッドの呼び出し
		//引数はお任せ
		human.eat("ペプシ",800);

		//displayメソッドの呼び出し
		human.dispAll();



		Reizouko reizouko = new Reizouko();

		reizouko.setName("家電");
		reizouko.setSize("大");
		reizouko.setDenryoku("100W");


		reizouko.dispAll();
	}
}
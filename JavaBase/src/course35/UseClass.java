package course35;

public class UseClass {
	public static void main(String[] args) {

		//インスタンスの生成
		Human human = new Human();

		//パラメータの設定
		human.setSimei("名前");
		human.setHobby("趣味");
		human.setWeight(63000);

		//displayメソッドの呼び出し
		human.dispAll();

		//eatメソッドの呼び出し
		human.eat("ハンバーガー", 1200);



		Animal animal = new Animal();

		animal.setName("あさ");
		animal.setKari("張手");

		animal.eat("墨汁", 900);
	}
}
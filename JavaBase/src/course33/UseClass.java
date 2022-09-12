package course33;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human human = new Human();

		//Humanクラス
		human.setName("うえはら");
		human.setHobby("スカイダイビング");
		human.setWeight(870000);

		human.disp();
		human.dispWeight();

		human.eat("ナムル", 48900);

		human.dispWeight();



		Animal animal = new Animal();

		animal.setName("サイ");
		animal.setKari("角で相手を粉砕する");
		animal.setWeight(700000);

		animal.display();
		animal.dispWeight();



		Fish fish = new Fish();

		fish.setName("鯛");
		fish.setCategory("海水魚");
		fish.setWeight(900000);

		fish.display();
		fish.dispWeight();



		Bird bird = new Bird();

		bird.setName("鷲");
		bird.setMaisu(90);
		bird.setWeight(9000);

		bird.display();
		bird.dispWeight();


		Student student = new Student();

		student.setName("あい");
		student.setSeiseki("良");
		student.setTokuikamoku("数学");
		student.setWeight(90000);

		student.display();
	}
}

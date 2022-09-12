package Course25;

public class ClassSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human me = new Human();

		me.name = "上原";
		me.hobby = "スポーツ";
		me.address = "山武市";


		Human tonari = new Human();

		tonari.name = "阿部";
		tonari.hobby = "御朱印集め";
		tonari.address = "成田山";


		me.talk();
		tonari.talk();

	}

}

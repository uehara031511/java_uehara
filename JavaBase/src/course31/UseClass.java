package course31;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human.school = "国際理工カレッジ";
		Human.schoolDisp();

		Human me = new Human();
		me.setName("国際太郎");
		me.display();



		Human you = new Human();

		Human.gakka = "情報システム科";
		System.out.println(you.gakka);
	}

}

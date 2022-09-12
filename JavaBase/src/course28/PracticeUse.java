package course28;

public class PracticeUse {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pokemon poke1 = new Pokemon();
		Pokemon poke2 = new Pokemon();

		poke1.name = "マッギョ";
		poke1.hp = 300;
		poke1.atk = 100;
		poke1.def = 50;
		poke1.exp = 100;

		poke2.name = "シビシラス";
		poke2.hp = 1000;
		poke2.atk = 100;
		poke2.def = 100;
		poke2.exp = 10;


		int x = poke1.damaged(poke2.atk - poke1.def);
		int y = poke1.heal(poke1.atk / 2);

		System.out.println("シビシラスの攻撃");
		System.out.println("マッギョの現在のHPは"+ x);
		System.out.println("マッギョのheal後の現在のHPは"+ y);

		System.out.println("");

		int a = poke2.damaged(poke1.atk - poke2.def);
		int b = poke2.heal(poke2.atk / 2);

		System.out.println("マッギョの攻撃");
		System.out.println("シビシラスの現在のHPは"+ a);
		System.out.println("シビシラスのheal後の現在のHPは"+ b);


		int o = poke1.exp;
		int p = poke2.exp;

		if(x == 0) {
			o = o + p;
		}if(y == 0) {
			p = p + o;
		}
	}
}
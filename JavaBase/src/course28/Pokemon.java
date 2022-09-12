package course28;

public class Pokemon {
	String name;
	int hp;
	int atk;
	int def;
	int exp;


	Pokemon() {
		name = "未設定";
		hp = 0;
		atk = 0;
		def = 0;
		exp = 0;
	}
	void display() {
		System.out.println(name);
		System.out.println(hp);
		System.out.println(atk);
		System.out.println(def);
		System.out.println(exp);
	}

	int damaged(int x) {
		return hp - x;
	}

	int heal(int y) {
		return hp + y;
	}
}

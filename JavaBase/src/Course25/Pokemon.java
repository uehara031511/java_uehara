package Course25;

public class Pokemon {

	String name;
	int height;
	int weight;
	int tokuko;
	int tokubo;
	int zukan;

	void naku(){
		System.out.println(this.name + "は鳴いた");
	}
	void zukan() {
		System.out.println("名前:" + this.name);
		System.out.println("高さ:" + this.height);
		System.out.println("重さ:" + this.weight);
		System.out.println("特攻:" + this.tokuko);
		System.out.println("特防:" + this.tokubo);
		System.out.println("図鑑:" + this.zukan);
	}

}

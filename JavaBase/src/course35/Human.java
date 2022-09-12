package course35;

//サブクラス（子クラス）
public class Human extends Creatures{
	//変数
	private String simei;
	private String hobby;

	//オーバーライドしたメソッド
	//Creaturesクラスの「eat」メソッドを上書きしている。
	void eat(String food,int calc) {
		System.out.println("飲み会で" + food + "を食べた。");
		System.out.println("帰り道歩いて帰ったので、体重は増えなかった");
	}

	//メソッド
	void dispAll() {
		System.out.println("私の名前は" + this.simei + "です");
		System.out.println("私の趣味は" + this.hobby + "です");
		System.out.println("私の体重は" + super.getWeight() + "です。");
	}

	void dispWeight() {
		System.out.println("体重は" + super.getWeight() +"gです");
	}


	//getter&setter
	public String getSimei() {
		return simei;
	}

	public void setSimei(String simei) {
		this.simei = simei;
	}

	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
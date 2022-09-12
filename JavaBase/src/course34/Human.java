package course34;

//サブクラス（子クラス）
public class Human extends Creatures {
	//変数
	private String simei;
	private String hobby;

	//メソッド
	void dispAll() {
		System.out.println("私は"+ super.getName() +"です");
		System.out.println("私の名前は" + this.simei + "です");
		System.out.println("私の趣味は" + this.hobby + "です");
		System.out.println("私の体重は"+ super.getWeight() +"です");
	}


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
package course33;

public class Animal extends Creatures {

	private String name;
	private String kari;

	void display() {
		System.out.println("名前は" + this.name);
		System.out.println("狩りは" + this.kari);
	}
	void dispWeight() {
		System.out.println("体重は" + super.getWeight() + "gです");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKari() {
		return kari;
	}

	public void setKari(String kari) {
		this.kari = kari;
	}

}

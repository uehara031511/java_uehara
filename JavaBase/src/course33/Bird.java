package course33;

public class Bird extends Creatures {

	private String name;
	private int maisu;

	void display() {
		System.out.println("名前は"+ this.name);
		System.out.println("枚数は"+ this.maisu);
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

	public int getMaisu() {
		return maisu;
	}

	public void setMaisu(int maisu) {
		this.maisu = maisu;
	}


}

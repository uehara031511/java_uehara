package course33;

public class Fish extends Creatures {

	private String name;
	private String category;

	void display() {
		System.out.println("名前は" + this.name);
		System.out.println("カテゴリは" + this.category);
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}

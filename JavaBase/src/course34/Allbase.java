package course34;

public class Allbase {
	private String name;

	void display() {
		System.out.println("名前は" + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
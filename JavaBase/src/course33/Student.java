package course33;

public class Student extends Creatures {

	private String name;
	private String seiseki;
	private String tokuikamoku;

	void display() {
		System.out.println("名前は"+ this.name);
		System.out.println("成績"+ this.seiseki);
		System.out.println(this.tokuikamoku);
		System.out.println(super.getWeight());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeiseki() {
		return seiseki;
	}

	public void setSeiseki(String seiseki) {
		this.seiseki = seiseki;
	}

	public String getTokuikamoku() {
		return tokuikamoku;
	}

	public void setTokuikamoku(String tokuikamoku) {
		this.tokuikamoku = tokuikamoku;
	}


}

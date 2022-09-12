package course35;

public class Animal extends Creatures {

	private String name;
	private String kari;

	void eat(String food, int cal) {
		System.out.println(this.name +"は"+ food +"を食べた");
		System.out.println("その後、寝た");
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

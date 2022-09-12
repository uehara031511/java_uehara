package course34;

public class Reizouko extends Kaden{

	private String denryoku;

	void dispAll() {
		System.out.println(super.getName());
		System.out.println(super.getSize());
		System.out.println(this.denryoku);
	}

	public String getDenryoku() {
		return denryoku;
	}

	public void setDenryoku(String denryoku) {
		this.denryoku = denryoku;
	}



}

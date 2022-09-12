
package course36;

public class Cat implements Animal{

	private String name;
	private String shurui;
	private String size;

	////////Animalインタフェースで定義されたメソッド（eat,run)////////
	public void eat(String food) {
		System.out.println(food + "を食べます。もぐもぐ。");
	}

	public void run() {
		System.out.println(this.name + "走り去ります。");
	}



	public void walk() {
		System.out.println("歩きました");
	}

	public void kari(String x) {
		System.out.println("狩りのスタイルは"+ x +"です");
	}

	/////////////getter setter//////////////
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShurui() {
		return shurui;
	}


	public void setShurui(String shurui) {
		this.shurui = shurui;
	}

	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
}
package Course27;

public class Drink {
		int price;
		String name;

		Drink(){
			name = "午後の紅茶";
			price = 0;
		}
		void display() {
			System.out.println(this.name +"の値段は"+ this.price +"です");
		}
}

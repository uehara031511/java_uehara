package Course27;

public class Food {
		String name;
		int price;
		int review;

		Food(String name, int price, int review){
			this.name = name;
			this.price = price;
			this.review = review;
		}

		void display() {
			System.out.println("名前は"+ this.name);
			System.out.println("値段は"+ this.price);
			System.out.println("評価は"+ this.review);
			;
		}
}

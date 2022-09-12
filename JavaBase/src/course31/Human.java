package course31;

public class Human {
		private String name;

		static String school;

		void display() {
			System.out.println(this.name);
			System.out.println(school);
		}

		public static void schoolDisp() {
			System.out.println("あなたの学校は"+ school +"です");
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}



		static String gakka;


}

package course16;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		String[] mojiArray = new String[5];

		mojiArray[0] = ("あ");
		mojiArray[1] = ("い");
		mojiArray[2] = stdIn.next();
		mojiArray[3] = ("え");
		mojiArray[4] = ("お");

		System.out.println(mojiArray[1]);
	}
}

package course10;

import java.util.Random;
import java.util.Scanner;

public class QuestionBOSS {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		Random RandObj = new Random();
		int n = RandObj.nextInt(100) + 1;

		if(n <= 3) {
			System.out.println("SSR");
		}if(n >= 4 && n <= 18) {
			System.out.println("SR");
		}if(n >= 19) {
			System.out.println("R");
		}

		System.out.println(n);
	}

}

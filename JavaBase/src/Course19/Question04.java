package Course19;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		System.out.println("進みたい方向を矢印で入力");
		String z = stdIn.next();
		
		if("←".equals(z)) {
			y = y - 1;
		}else if("→".equals(z)) {
			y = y + 1;
		}else if("↑".equals(z)) {
			x = x - 1;
		}else if("↓".equals(z)) {
			x = x + 1;
		}
		
		int[][] mapArray = new int[5][5];
		
		mapArray [0][0] = 2;
		mapArray [0][1] = 0;
		mapArray [0][2] = 0;
		mapArray [0][3] = 0;
		mapArray [0][4] = 0;

		mapArray [1][0] = 2;
		mapArray [1][1] = 0;
		mapArray [1][2] = 0;
		mapArray [1][3] = 1;
		mapArray [1][4] = 0;

		mapArray [2][0] = 2;
		mapArray [2][1] = 0;
		mapArray [2][2] = 0;
		mapArray [2][3] = 0;
		mapArray [2][4] = 0;

		mapArray [3][0] = 2;
		mapArray [3][1] = 3;
		mapArray [3][2] = 0;
		mapArray [3][3] = 0;
		mapArray [3][4] = 3;

		mapArray [4][0] = 3;
		mapArray [4][1] = 3;
		mapArray [4][2] = 3;
		mapArray [4][3] = 4;
		mapArray [4][4] = 0;
		
		
		
		if(mapArray [x][y] == 0){
			System.out.println("平原です");
		}else if(mapArray [x][y] == 1) {
			System.out.println("勇者です");
		}else if(mapArray [x][y] == 2) {
			System.out.println("川です");
		}else if(mapArray [x][y] == 3) {
			System.out.println("山です");
		}else if(mapArray [x][y] == 4) {
			System.out.println("商人です");
		}
	}

}

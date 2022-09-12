package course16;

public class PairQuestion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[6];

		arr[0] = 50;
		arr[1] = 20;
		arr[2] = 40;
		arr[3] = 30;
		arr[4] = 10;

		arr[5] = arr[0];
		arr[0] = arr[4];
		arr[4] = arr[5];
		arr[5] = arr[2];
		arr[2] = arr[3];
		arr[3] = arr[5];

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}

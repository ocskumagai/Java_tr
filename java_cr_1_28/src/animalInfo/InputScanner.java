package animalInfo;

import java.util.Scanner;

public class InputScanner {
	public static String[] InputData() {
		Scanner sc = new Scanner(System.in);
		String input;
		String[] dataBox;
		do {
			System.out.println("コンソールに文字を入力してください");
			input = sc.nextLine();
			// 入力値を[,]で区切り、配列に格納する
			dataBox = input.split(",");
			// データがnullだった場合処理を繰り返す
		} while (input == " ");
		sc.close();
		return dataBox;
	}
}
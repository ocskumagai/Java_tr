package prefecture_info;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

/*コンソール入力し、昇順、降順に並び替えた配列を返すクラス*/
public class InputScanner {
	public static Integer[] InputData() {
		// スキャナー実行
		Scanner sc = new Scanner(System.in);
		// ローカル変数と配列を作成
		String id;
		String[] sIdBox;
		do {
			System.out.println("コンソールに文字を入力してください");
			// 入力した文字を格納する変数
			id = sc.nextLine();
			// 入力値を[,]で区切り、配列に格納する
			sIdBox = id.split(",");
			// データがnullだった場合処理を繰り返す
		} while (id == "");
		// String型の配列をint型に変換
		int[] iIdBox = Stream.of(sIdBox).mapToInt(Integer::parseInt).toArray();
		// int型の配列をInteger型にするために新しく配列作成
		Integer[] changedIdBox = new Integer[iIdBox.length];
		// int型に入った配列の要素をInteger型に変換する処理
		for (int i = 0; i < iIdBox.length; i++) {
			changedIdBox[i] = Integer.valueOf(iIdBox[i]);
		}
		System.out.println("昇順,降順どちらにしますか?");
		System.out.println("昇順なら0、降順なら1を入力してください");
		// コンソール入力
		int value = sc.nextInt();
		// 入力値が0だった場合昇順、１だった場合降順
		if (value == 0) {
			// 昇順に並び替える
			Arrays.sort(changedIdBox);
		} else if (value == 1) {
			Arrays.sort(changedIdBox, Collections.reverseOrder());
			// 降順に並び替える
		} else {

		}
		// scannerを閉じる
		sc.close();
		// 配列を返す
		return changedIdBox;
	}
}
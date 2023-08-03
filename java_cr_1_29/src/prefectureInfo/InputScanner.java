package prefectureInfo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*コンソール入力し、昇順に並び替えた配列を返すクラス*/
public class InputScanner {
	public static String[] InputData() {
		// スキャナー実行
		Scanner sc = new Scanner(System.in);
		// ローカル変数と配列を作成
		String id;
		String[] idBox;
		do {
			System.out.println("コンソールに文字を入力してください");
			// 入力した文字を格納する変数
			id = sc.nextLine();
			// 入力値を[,]で区切り、配列に格納する
			idBox = id.split(",");
			// データがnullだった場合処理を繰り返す
		} while (id == "");
		System.out.println("昇順,降順どちらにしますか?");
		System.out.println("昇順なら0、降順なら1を入力してください");
		// コンソール入力
		int value = sc.nextInt();
		// 入力値が0だった場合昇順、１だった場合降順
		if (value == 0) {
			// 昇順に並び替える
			Arrays.sort(idBox);
		} else if (value == 1) {
			// 降順に並び替える
			Arrays.sort(idBox, Collections.reverseOrder());
		} else {
			System.out.println("正しい値を入力してください");
		}
		// scannerを閉じる
		sc.close();
		// 配列を返す
		return idBox;
	}
}
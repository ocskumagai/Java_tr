package prefectureInfo;

import java.util.Arrays;
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
			//	入力した文字を格納する変数		
			id = sc.nextLine();
			// 入力値を[,]で区切り、配列に格納する
			idBox = id.split(",");
			// データがnullだった場合処理を繰り返す
		} while (id == "");
		// スキャナーを閉じる	
		sc.close();
		// 配列を昇順になおす
		Arrays.sort(idBox);
		// 配列を返す
		return idBox;
	}
}
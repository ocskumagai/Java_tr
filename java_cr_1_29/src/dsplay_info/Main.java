package dsplay_info;

import prefecture_info.PrefectureData;
import prefecture_info.InputScanner;
import prefecture_info.PrefectureBean;

public class Main {

	public static void main(String[] args) {
		/*
		 * 
		 * 0, "北海道:札幌市:83424" 1, "青森県:青森市:9646" 2, "岩手県:盛岡市:15275" 3, "宮城県:仙台市:7282" 4,
		 * "秋田県:秋田市:11638" 5, "山形県:山形市:9323" 6, "福島県:福島市:13784" 7, "茨城県:水戸市:6097" 8,
		 * "栃木県:宇都宮市:6408" 9, "群馬県:前橋市:6362" 10, "埼玉県:さいたま市:3798"
		 * 
		 * コンソールに数字と昇順・降順の値が入力されると上記配列に対応する 都道府県がソートされてコンソールに出力されるように作ってください
		 * ※Packageを2つ作ってください ※複数選択できるようにしてください
		 * 
		 * 例: 8,5,9,..... と入力された場合（昇順）
		 * 
		 * 都道府県名：山形県 県庁所在地：山形市 面積：9323.0km2
		 * 
		 * 都道府県名：栃木県 県庁所在地：宇都宮市 面積：6408.0km2
		 * 
		 * 都道府県名：群馬県 県庁所在地：前橋市 面積：6362.0km2
		 * 
		 */

		// スキャナークラスのメソッドを呼び配列を返すかつ変数に受け取った配列を格納する
		String[] idBox = InputScanner.InputData();
		// 拡張for文で配列を1つずつ取り出す
		for (String id : idBox) {
			// データクラスのデータを取得するメソッドを呼び、変数に格納する
			String cityData = PrefectureData.getCityData(id);
			// データを「:」で区切り、さらに配列に格納する
			String[] cityInfo = cityData.split(":");
			// それぞれの変数に配列の値を格納していく
			String prefectureName = cityInfo[0];
			String mainCity = cityInfo[1];
			double area = Integer.parseInt(cityInfo[2]);
			// 変数をインスタンスの引数にセットし、インスタンスを生成する
			PrefectureBean prefecture = new PrefectureBean(prefectureName, mainCity, area);
			// 生成したインスタンスで情報を表示するメソッドにアクセスする
			prefectureInfo(prefecture);
		}

	}

	// 情報を表示する
	public static void prefectureInfo(PrefectureBean prefecture) {
		String cityInfo = "都道府県:" + prefecture.getPrefectureName() + "\n県庁所在地:" + prefecture.getMainCity() + "\n面積:"
				+ (String.format("%.1f", prefecture.getArea())) + "km2" + "\n";
		System.out.println(cityInfo);
	}

}

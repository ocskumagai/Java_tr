package animalInfo;

public class Data {
	public static String getScientific(AnimalBean animal) {
		// インスタンスで名前を取得
		String scientificName;
		// 名前と一致した場合その動物の学名を取得する
		switch (animal.getName()) {
		case "ライオン":
			scientificName = "パンテラ　レオ";
			break;
		case "ゾウ":
			scientificName = "ロキソドンタ・サイクロティス";
			break;
		case "パンダ":
			scientificName = "アイルロポダ・メラノレイウカ";
			break;
		case "チンパンジー":
			scientificName = "パン・トゥログロディテス";
			break;
		case "シマウマ":
			scientificName = "チャップマンシマウマ";
			break;
		case "インコ":
			scientificName = "不明";
			break;
		default:
			scientificName = "";

		}
		// 取得した学名の値を返す
		return scientificName;
	}

}
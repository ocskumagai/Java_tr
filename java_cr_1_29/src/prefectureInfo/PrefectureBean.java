package prefectureInfo;

public class PrefectureBean {
	// インスタンスフィールド宣言
	private String prefectureName;
	private String mainCity;
	private int area;

	// コンストラクタ定義
	public PrefectureBean(String prefectureName, String mainCity, int area) {
		this.prefectureName = prefectureName;
		this.mainCity = mainCity;
		this.area = area;
	}

	// prefectureNameを戻り値を返す
	public String getPrefectureName() {
		// 値がNULLかどうかチェックする
		if (this.prefectureName == "") {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return prefectureName;
	}

	// 値をセットする
	public void setPrefectureName(String prefecture) {
		this.prefectureName = prefecture;
	}

	// mainCityの戻り値を返す
	public String getMainCity() {
		// 値がNULLかどうかチェックする
		if (this.mainCity == "") {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return mainCity;
	}

	// 値をセットする
	public void setMainCity(String mainCity) {
		this.mainCity = mainCity;
	}

	// areaCityの戻り値を返す
	public int getArea() {
		// 値が0かどうかチェックする
		if (this.area == 0) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return area;
	}

	// 値をセットする
	public void setArea(int area) {
		this.area = area;
	}

	// 情報を表示させるメソッド
	public void prefectureInfo() {
		String cityInfo = "都道府県:" + this.getPrefectureName() + "\n県庁所在地:" + this.getMainCity() + "\n面積:"
				+ this.getArea() + "km2" + "\n";
		System.out.println(cityInfo);
	}

}

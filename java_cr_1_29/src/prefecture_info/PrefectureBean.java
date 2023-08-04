package prefecture_info;

import java.util.Objects;

public class PrefectureBean {
	// インスタンスフィールド宣言
	private String prefectureName;
	private String mainCity;
	private double area;

	// コンストラクタ定義
	public PrefectureBean(String prefectureName, String mainCity, double area) {
		this.prefectureName = prefectureName;
		this.mainCity = mainCity;
		this.area = area;
	}

	// 戻り値を返す
	public String getPrefectureName() {
		// 値がNULLかどうかチェックする
		if (Objects.isNull(this.prefectureName)) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return prefectureName;
	}

	// 値をセットする
	public void setPrefectureName(String prefecture) {
		this.prefectureName = prefecture;
	}

	// 戻り値を返す
	public String getMainCity() {
		// 値がNULLかどうかチェックする
		if (Objects.isNull(this.mainCity)) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return mainCity;
	}

	// 値をセットする
	public void setMainCity(String mainCity) {
		this.mainCity = mainCity;
	}

	// 戻り値を返す
	public double getArea() {
		// 値が0かどうかチェックする
		if (this.area == 0) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return area;
	}

	// 値をセットする
	public void setArea(double area) {
		this.area = area;
	}
}

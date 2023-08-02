package animalInfo;

import animalInfo.Animal;

public class Animal {
//	privateで変数を宣言
	private String name;
	private double height;
	private int speed;

	// コンストラクタ生成かつインスタンス変数宣言
	Animal(String name, double height, int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}

	// 戻り値で値を返す
	public String getName() {
		return name;
	}

	// 引数の値を格納
	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double weight) {
		this.height = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 動物の情報を表示するメソッド
//	public static void animalInfo(Animal animal, String scientificName) {
//		System.out.println("動物名:" + animal.getName());
//		System.out.println("体長:" + animal.getHeight() + "m");
//		System.out.println("速度:" + animal.getSpeed() + "km/h");
//		System.out.println("学名:" + scientificName);
//		System.out.println();
//	}
	public String animalInfo(String scientificName) {
		return "動物名:" + this.getName() + "\n体長:" + this.getHeight() +"m"
		+ "\n速度:" + this.getSpeed() + "km/h" + "\n学名:" + scientificName + "\n";
	}

	// nullをチェックするメソッド
	public void nullCheck(String scientificName) {
		String name = this.getName();

		if (name.isEmpty() || scientificName.isEmpty()) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}

	}

	// 学名を取得するメソッド
	public String getscientific() {
		// インスタンスで名前を取得
		String scientificName;
		// 名前と一致した場合その動物の学名を取得する
		switch (this.getName()) {
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

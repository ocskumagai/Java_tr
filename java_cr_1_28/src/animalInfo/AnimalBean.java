package animalInfo;

public class AnimalBean {
//	privateで変数を宣言
	private String name;
	private double height;
	private int speed;

	// コンストラクタ生成
	AnimalBean(String name, double height, int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}

	// 戻り値で値を返す
	public String getName() {
		// NUllの場合プログラム強制終了
		if (this.name == "") {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return name;
	}

	// 引数の値を格納
	public void setName(String name) {
		this.name = name;
	}

	// 戻り値で値を返す
	public double getHeight() {
		// 値が0の場合プログラム強制終了
		if (this.height == 0) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return height;
	}

	// 引数の値を格納
	public void setHeight(double weight) {
		this.height = weight;
	}

	// 戻り値で値を返す
	public int getSpeed() {
		// 値が0の場合プログラム強制終了
		if (this.speed == 0) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
		return speed;
	}

	// 引数の値を格納
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 情報を表示させるメソッド
	public void animalInfo(String scientificName) {
		String animalInfo = "動物名:" + this.getName() + "\n体長:" + this.getHeight() + "m" + "\n速度:" + this.getSpeed()
				+ "km/h" + "\n学名:" + scientificName + "\n";
		System.out.println(animalInfo);
	}

}
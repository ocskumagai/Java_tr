package animal_info;

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
	public static void animalInfo(Animal animal) {
		System.out.println("動物名:" + animal.getName());
		System.out.println("体長:" + animal.getHeight() + "m");
		System.out.println("速度:" + animal.getSpeed() + "km/h");
	}

	public static void nullCheck(Animal animal) {
		String name = animal.getName();
		if (name == null) {
			System.out.println("値が正しく設定されていません");
			System.exit(0);
		}
	}
}

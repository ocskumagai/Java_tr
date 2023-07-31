package animal_info;

public class Main {
	/*
	 * 
	 * 下記がコンソールに出力されるように作成してください ※thisとsetterとgetterとフィールドを使ってください
	 * 
	 * 動物名：ライオン 体長：2.1m 速度：80km/h
	 * 
	 */
	public static void main(String[] args) {
		// インスタンス生成
		Animal lion = new Animal("ライオン", 2.1, 80);
		// Animalクラスからメソッド呼び出し
		Animal.nullCheck(lion);
		Animal.animalInfo(lion);
	}

}

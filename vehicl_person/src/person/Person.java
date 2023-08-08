package person;

import vehicle.Bicycle;
import vehicle.Car;

public class Person {
	// インスタンス変数の宣言
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count;

	// コンストラクタの定義
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// インスタンスが生成されるたび、インクリメントを行う
		count++;

	}

	// BMIの結果を返すメソッド
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}
	// 情報を表示する
	public void print(double bmi) {
		String info = "\n名前は" + this.name + "です" + "\n年は" + this.age + "です" + "\nBMIは" + String.format("%.2f", bmi)
				+ "です";
		System.out.println(info);
	}

	// 人数の合計を表示する
	public static void sumPerson() {
		System.out.println("合計" + Person.count + "人です");
	}

	// 購入した人の名前を表示する処理
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
		// 購入した人の名前を表示する処理
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}

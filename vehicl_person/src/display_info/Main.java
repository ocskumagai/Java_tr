package display_info;

import person.Person;
import vehicle.Bicycle;
import vehicle.Car;

class Main {
	public static void main(String[] args) {
		// インスタンスを生成する
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("鈴木花子", 21, 1.5, 50);
		// インスタンス生成
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		//　インスタンスで誰が購入したかが分かるメソッド呼び出し	
		person1.buy(car);
		person2.buy(bicycle);
	}
}
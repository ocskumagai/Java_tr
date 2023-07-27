package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog Dog = new Dog();
		System.out.println(Dog.dog);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog Dog2 = new Dog(3);
		System.out.println(Dog2.NumDog);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		//現在の日時を取得	
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dtformat = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			
			String formatdate1 = dtformat.format(date); //表示形式+Stringに変換
			
			System.out.println(formatdate1); 
	}
}

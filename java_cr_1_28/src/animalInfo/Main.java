package animalInfo;

import java.util.Scanner;

public class Main {
	/*
	 * 
	 * コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	 * ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	 * 
	 * コンソール出力結果
	 * 
	 * コンソールに文字を入力してください 動物名：ライオン 体長：2.1m 速度：80km/h 学名：パンテラ レオ
	 * 
	 * 動物名：ゾウ 体長：3.2m 速度：40km/h 学名：ロキソドンタ・サイクロティス
	 * 
	 * 動物名：パンダ 体長：1.9m 速度：30km/h 学名：アイルロポダ・メラノレウカ
	 * 
	 * 動物名：チンパンジー 体長：0.94m 速度：25km/h 学名：パン・トゥログロディテス
	 * 
	 * 動物名：シマウマ 体長：2.4m 速度：65km/h 学名：チャップマンシマウマ
	 * 
	 * 動物名：インコ 体長：0.1m 速度：50km/h 学名：不明
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// 変数を宣言
		String input = null;
		String name = null;
		double height = 0;
		int speed = 0;
		String scientificName = null;
		// 配列を作成
		String[] dataBox;
		// Scannerを起動
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("コンソールに文字を入力してください");
			input = sc.nextLine();
			// 入力値を[,]で区切り、配列に格納する
			dataBox = input.split(",");
			// データがnullだった場合処理を繰り返す
		} while (input.isEmpty());
		sc.close();
		// 配列を1つずつ取り出し、配列の数ループする
		for (String data : dataBox) {
			// データをさらに[:]で区切り、新たに配列に格納する
			String[] animalInfo = data.split(":");
			// 配列の値をそれぞれの変数に格納
			name = animalInfo[0];
			height = Double.parseDouble(animalInfo[1]);
			speed = Integer.parseInt(animalInfo[2]);
			// インスタンス変数生成
			Animal animal = new Animal(name, height, speed);
			// 学名を取得するメソッドの定義
			scientificName = Animal.getscientific(animal);
			// nullのチェック
			Animal.nullCheck(animal, scientificName);
			// 動物の情報を表示するメソッドの定義
			Animal.animalInfo(animal, scientificName);
		}

	}

}
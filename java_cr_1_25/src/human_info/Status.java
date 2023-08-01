package human_info;

import java.util.Random;

public class Status extends Human {

	/*
	 * 親クラスのコンストラクタ引継ぎをし、 スーパーを使い、引数に格納できるようにする
	 */
	Status(String name, int hp, int mp, int power, int speed, int defense) {
		super(name, hp, mp, power, speed, defense);
	}

	/*
	 * ランダムな数字の値をそれぞれ変数に格納し、 インスタンスを戻り値で返す
	 */
	public static Status inputStatus(String name) {
		// ランダム変数作成
		Random r = new Random();
		// ランダムでそれぞれの値に数字を格納
		int hp = r.nextInt(1000);
		int mp = r.nextInt(1000);
		int power = r.nextInt(1000);
		int speed = r.nextInt(1000);
		int defense = r.nextInt(1000);
		// 戻り値でインスタンス変数を返す
		return new Status(name, hp, mp, power, speed, defense);
	}

	/* ステータスを表示させるメソッド */
	public static void displayStatus(Status player) {
		System.out.println("こんにちは" + "「" + player.getName() + "」" + "さん");
		System.out.println("ステータス");
		System.out.println("HP:" + player.getHp());
		System.out.println("MP:" + player.getMp());
		System.out.println("攻撃力:" + player.getPower());
		System.out.println("素早さ:" + player.getSpeed());
		System.out.println("防御力:" + player.getDefense());
	}
}
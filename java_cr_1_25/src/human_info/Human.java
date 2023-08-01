package human_info;

public class Human {
	// アクセス修飾子をprivateで宣言
	private String name;
	private int hp;
	private int mp;
	private int power;
	private int speed;
	private int defense;

	// コンストラクタを生成
	Human(String name, int hp, int mp, int power, int speed, int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.power = power;
		this.speed = speed;
		this.defense = defense;

		/* ゲッターとセッターのメソッドを定義 */
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

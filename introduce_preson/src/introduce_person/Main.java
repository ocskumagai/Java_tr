package introduce_person;

class Main {
	public static void main(String[] args) {
		// インスタンスを生成する
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("鈴木花子", 21, 1.5, 50);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		// BMIの結果の値を受け取り、指定した人間の情報表示
		person1.print(person1.bmi());
		person2.print(person2.bmi());
		// 合計人数を表示する
		Person.sumPerson();
	}
}
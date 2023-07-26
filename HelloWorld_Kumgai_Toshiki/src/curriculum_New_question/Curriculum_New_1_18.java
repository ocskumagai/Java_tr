package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		public static void greeting(String hoge , int num) {
			System.out.println(hoge + num);
		}
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void multiplication(int num1 ,int num2) {
			System.out.println(num1 * num2);
		}
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	    public static void displayArray( int numbox[]) {
	    		for(int num:numbox) {
	    	    System.out.println(num);
	    	}
	    }
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void multiplication(double num1 , double num2) {
			System.out.println(num1 + num2);
		}
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		public static int[] randomNum(int[] valueBox , int num) {
			Random r = new Random();
			int value = 0;
		//　引数に置かれた数字分の格納できる数を宣言		
			valueBox = new int[num];
			for(int i = 0; i < num; i++ ) {
		// 1から100までの数字をランダムで変数に入れる				
				value = r.nextInt(101) + 1;
				System.out.println(value);
		//　配列にランダムの数字を格納する				
				valueBox[i] = value;
			} 
		//　配列を返す			
			return valueBox;
		}

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		public static double displayAvg (int[] valueBox ) {
		//変数初期化			
			int sum = 0;
		//　配列の要素を１つずつ取り出し、要素を和算する			
			for(int value:valueBox) {
				sum += value;	
			}
		//	平均点を求めるための変数		
			double avg = (double)sum / valueBox.length;
			System.out.println(avg);
		//	平均値を返す	
			return avg;
		}
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		public static void booleanAvg(double avg) {	
			System.out.println(avg > 50 ? "ture" : "false");
		}
		public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
	    // Q1
		greeting("Hello JavaSE ",11);
		// Q2
		multiplication(2,3);
		// Q3
		int num[] = {22,30,60};
		displayArray(num);
		// Q4
		multiplication(5,4.5);
		// Q5
		int[] valueBox = new int[0];
		valueBox = randomNum(valueBox,4); 
	    double avg = displayAvg(valueBox);
	    booleanAvg(avg);
	   
	    
		
	}
}


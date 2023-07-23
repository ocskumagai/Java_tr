package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i<10; i++) {
			System.out.println("");
			for(int j=1;j<21;j++) {
				int num =i * j;
//				合計の値が10以下の場合かつjが10以下の場合
				
//				結果が10以下かつjが10未満の場合の表示
				if(num<10 && j < 10)System.out.print("0"+"0"+j+" "+"*"+" "+"0"+"0"+i+" "+"="+" "+"0"+"0"+num+" " + "||" + " " );
//				合計の値が9以上かつjの値が10以下の場合
				else if(num > 9 && j < 10  )System.out.print("0"+"0"+j+" "+"*"+" "+"0"+"0"+i+" "+"="+" "+"0"+num+" " + "||" + " " );
//				合計が9 以上 100未満　かつjの値が１0以上かつ結果が100以上ではない、かつjが20の時
				else if(num > 9 && j >= 10 && !(num >=100) && !(j == 20))System.out.print("0"+j+" "+"*"+" "+"0"+"0"+i+" "+"="+" "+"0"+num+" " + "||" + " ");
//				合計が9 以上 100未満　かつjの値が１0以上かつ結果が100以上ではない、かつjが20ではない時
				else if(num > 9 && j >= 10 && !(num >=100) && (j == 20))System.out.print("0"+j+" "+"*"+" "+"0"+"0"+i+" "+"="+" "+"0"+num+" " + " ");
				else if(j == 20)System.out.print("0"+j+" "+"*"+" "+"0"+"0"+i+" "+"="+" "+num+" " +" " );
				else System.out.print("0"+j+" "+"*"+" "+"0"+"0"+i+" "+"="+" "+num+" " + "||"+" ");
			}			
		}

	}

}



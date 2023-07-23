package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		for (int i=1;i<10;i++) {

			System.out.println();
//			10回ループする
			for (int j=1;j<10;j++) {
				int num=i*j;
//				合計が１０未満かつ、jが９ではないとき
				if(num<10 && !(j == 9))System.out.print("0"+i+ " "+"*"+" " +"0"+j+ " "+ "="+" " +"0"+num+" " +  "||" + " " );
//				合計が１０未満かつ、jが９の時
				else if(num<10 && (j == 9))System.out.print("0"+i+" "+"*"+" "+"0"+j+" "+ "="+" "+"0"+num + " " );
//				jが９の時
				else if(j == 9 )System.out.print( "0"+i+" "+"*"+" "+"0"+j+" "+"="+" "+num+ " ");
				else System.out.print("0"+i+" "+"*"+" "+"0"+j+" "+"="+" "+num+" " + "||"+" ");
	
			}

		}

	}

}

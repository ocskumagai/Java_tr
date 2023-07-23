package curriculum_B;

import java.util.Scanner;

public class Ques7 {


	public static void main(String[] args) {
		/*変数の作成*/
//		配列の要素を取り出すための変数
		int y = 0;
//		生徒の人数を表示させるための変数
		int b = 1;
//		生徒の人数分処理を回すための変数
//		生徒の人数を入れる箱
		int NumStudents = 0;
//		各教科の変数
		int english = 0;
		int math = 0;
		int science = 0;
		int society = 0;
		double sumScore;
		double avgScore;
//各生徒、教科の点数の合計を入れる変数
		int sumEnglish = 0;
		int sumMath = 0;
		int sumScience = 0;
		int sumSociety = 0;
//各生徒、教科の点数の平均を入れる変数		
		double avgEnglish = 0;
		double avgMath = 0;
		double avgScience = 0;
		double avgSociety = 0;
//	　　　　入力開始
		Scanner scanner = new Scanner(System.in);
		System.out.println("生徒の人数を入力してください(2以上)");
//		生徒の人数を代入するための変数
		NumStudents = scanner.nextInt();
		int [][]eachStudentsScore = new int [NumStudents][4];
//		各点数を配列に代入する
	     do {
	        /*点数を入力する処理
         　  生徒の人数分ループする*/	    	 
			System.out.println(b +"人目の[英語]の点数を入力してください");
			english = scanner.nextInt();
			eachStudentsScore[y][0] = english; 
			System.out.println(b +"人目の[数学]の点数を入力してください");
			math = scanner.nextInt();
			eachStudentsScore[y][1] = math; 
			System.out.println(b +"人目の[理科]の点数を入力してください");
			science = scanner.nextInt();
			eachStudentsScore[y][2] = science; 		
			System.out.println(b +"人目の[社会]の点数を入力してください");
			society = scanner.nextInt();
			eachStudentsScore[y][3] = society; 
//			改行
			System.out.println();
//			インクリメント
			y++;
			b++;
		    
		}while(b <= NumStudents);
//	     配列の要素を0に初期化
	     y = 0;
	     /*各生徒の平均点を求める処理*/	     
		   for(int j = 1; j <= NumStudents; j++) {
//			   各生徒の全教科の合計点を入れる
		       sumScore = eachStudentsScore[y][0] +
				   		  eachStudentsScore[y][1] +
				   		  eachStudentsScore[y][2] +
		   				  eachStudentsScore[y][3] ; 
//		       全生徒の英語の合計点
		       sumEnglish += eachStudentsScore[y][0];
//		       全生徒の数学の合計点
		       sumMath += eachStudentsScore[y][1];
//		       全生徒の理科の合計点
		       sumScience += eachStudentsScore[y][2];
//		       全生徒の社会の合計点
		       sumSociety += eachStudentsScore[y][3];
//		       全教科の合計点を教科の個数分割る
		       avgScore = sumScore / 4.0;		       
		   System.out.println(j + "人目の平均点は" + (String.format("%.2f",avgScore)) + "点です。");
//		   インクリメント
		   y++;
		}
//		   改行
		   System.out.println();
//		   全生徒の総合点数
		   double everySum = sumEnglish + sumMath + sumScience + sumSociety;
//		   	全生徒の英語の平均点
		    avgEnglish = sumEnglish / (double)NumStudents;
//　　　　　　　　　全生徒の数学の平均点
		    avgMath = sumMath / (double)NumStudents;
//　　　　　　　　　全生徒の理科の平均点
		    avgScience = sumScience / (double)NumStudents;
//			全生徒の社会の平均点
			avgSociety = sumSociety /(double)NumStudents;
//			全体の平均点
			double everyAvg = everySum /(NumStudents * 4.0);
	       
		   System.out.println("英語の平均点は" + (String.format("%.2f",avgEnglish))+ "点です。");
		   System.out.println("数学の平均点は" + (String.format("%.2f",avgMath))+ "点です。");
		   System.out.println("理科の平均点は" + (String.format("%.2f",avgScience)) + "点です。");
		   System.out.println("社会の平均点は" + (String.format("%.2f",avgSociety))+ "点です。");
		   System.out.println("全体の平均点は" + (String.format("%.2f",everyAvg)) + "点です。");
		 
			
	scanner.close();
	}

}
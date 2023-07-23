package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		/***　入力した物を配列に入れる処理 ****/	
//		scanner起動
	  Scanner sc = new Scanner(System.in);
//	  入力した文字を変数に代入
	  String data = sc.nextLine();
//	 　複数入力した文字を配列に代入する
	  String Appliances[] = data.split("、");
//	  ランダム変数の作成
	  Random r = new Random();
	  /***　配列を1つずつ要素を取り出し、ループを行う、判定を行う ****/		
	  for(String apliance : Appliances) {
		  int numberApliance = r.nextInt(11);
		  switch(apliance) {
		  case "パソコン" :
			  System.out.println("パソコンの残り台数は"+ numberApliance +"台です");
			  break;
		  case "冷蔵庫" :
			  System.out.println("冷蔵庫の残り台数は"+ numberApliance +"台です");
			  break;
		  case "扇風機" :
			  System.out.println("扇風機の残り台数は"+ numberApliance +"台です");
			  break;
		  case "洗濯機" :
			  System.out.println("洗濯機の残り台数は"+ numberApliance +"台です");
			  break;
		  case "加湿器" :
			  System.out.println("加湿器の残り台数は"+ numberApliance +"台です");
			  break;
		  case "テレビ" :
		  case "ディスプレイ" :
			  System.out.println(apliance.equals("テレビ")? "テレビの残り台数は" + numberApliance + "です" 
					             :"ディスプレイの残り台数は"+ (11 - numberApliance) + "台です");	
			  break;
		  default:
			  System.out.println("『" + apliance + "』"+"は指定の商品ではありません");
			  break;
		  		  
		  }
	  }
	  sc.close();
	}


}

//"ディスプレイの残り台数は"+ (11 - numberApliance) + "台です"

package curriculum_A;

import java.math.BigDecimal;

public class Qes1_13 {

	public static void main(String[] args) {
//		 TODO 自動生成されたメソッド・スタブ
/*1 変数の宣言 */

		byte num1;
		short num2;
		int num3;
		long num4;
		float num5 ;
		double num6;
		char text1;
		String text2;
		boolean data;
		
/*2 初期値を代入　*/
//	値の導入
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0L;
		num5 = 0.0f;
		num6 = 0.0d;
		text1 = '\u0000';
		text2 = null;
		data = false;
		
/*3 初期化した変数に値を代入*/
//		値の導入		
		num1 = 10;
		num2 = 100;
		num3 = 1000;
		num4 = 10000;
		num5 = (float) 9.5;
		num6 = 10.5;
		text1 = 'a';
		text2 = "ハロー";
		data = true;

/*4 課題通りのコンソール出力*/
		System.out.println(num1 + num2 + num3 + num4);
		System.out.println(num5 + num6);
	    System.out.println(text1 + text2 + data);
	    System.out.println(num1 + num2 + num3 + num4 + num5 + num6);
	    System.out.println(num1 * num2 * num3 * num4);
	    System.out.println(num6 / num2);
	    System.out.println(num2 - num1);

/*5 コード修正*/
//	    変数に代入
		int num = 20;
		int numl = 23;
//		コンソール出力
		System.out.println("ハローJAVA" + (num + numl));
		
		System.out.println("--------------------------------------------");
		
/*6　format通りにコンソール出力*/
//		変数作成
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String likeFood = "寿司";
		System.out.println("始めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + likeFood + "です");

/*7 BMIの出力*/
		double bmi = weight / (height /100 * height /100);
		BigDecimal newbmi1 = new BigDecimal(String.valueOf(bmi));
		System.out.println("BMIは" + newbmi1.setScale(1,BigDecimal.ROUND_DOWN) + "です");

/*8 6で宣言した変数に再代入し、コンソール表示*/
//		変数の再代入
	    name = "鈴木一郎";
		age = 24;
		height = 168.5;
	    weight = 64.2;
	    likeFood = "オムライス";	
	    
//	    BMIの計算
	    bmi = weight / (height /100 * height /100);
	    BigDecimal newbmi2 = new BigDecimal(String.valueOf(bmi));
	    
	    
	    System.out.println("--------------------------------------------");
	     
//	    コンソール出力
	    System.out.println("始めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + likeFood + "です");
//		System.out.println("BMIは" + (Math.ceil(bmi * 10) / 10) + "です");
		System.out.println("BMIは" + newbmi2.setScale(1,BigDecimal.ROUND_DOWN) + "です");

		System.out.println("--------------------------------------------");
		
/*9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください*/
//		6で使用した変数を和算する
		age += age;
		height += height;
		weight += weight;
		
//		BMIの計算	
		bmi = weight / (height /100 * height /100);
		BigDecimal newbmi3 = new BigDecimal(String.valueOf(bmi));
		
		
//		コンソール出力
		 System.out.println("始めまして" + name + "です");
		 System.out.println("年齢は" + age + "歳です");
		 System.out.println("身長は" + height + "cmです");
		 System.out.println("体重は" + weight + "kgです");
		 System.out.println("好きな食べ物は" + likeFood + "です");
		 System.out.println("BMIは" +  newbmi3.setScale(2,BigDecimal.ROUND_UP) + "です");

	     System.out.println("--------------------------------------------");
			
/*10 年齢が25以上ならtrueを出力*/
	     boolean overAge = age >= 25;
	     
//	     コンソールで出力
	     System.out.println(overAge);
	
/*11　年齢、身長、体重を文字列型に変化して繋げる */
//	     それぞれの変数を文字列型に変換
	     String changedAge = String.valueOf(age);
	     String changedHeight = String.valueOf(height);
	     String changedWeight = String.valueOf(weight);
	     System.out.println(changedAge + changedHeight + changedWeight);

/*12 11で変換した【年齢・身長】を整数型に変換して出力*/	     
//	     int型に変換
	     
	     int rechangedAge = Integer.valueOf(changedAge);
	     double rechangedHeight = Double.parseDouble(changedHeight);
	     
	     System.out.println(rechangedAge);
	     System.out.println((int)rechangedHeight);
//	     
	     
/*13 【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力*/
	     System.out.println(rechangedAge >= 25 || rechangedHeight >= 160);
	}

}

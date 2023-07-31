package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Info_food {
	//インスタンス変数の作成	
	public String country;
	public String food;
	public String kindOf;
	
	public Info_food(String country , String food , 
					 String kindOf) 
	{
        // インスタンス変数に文字を格納
		this.country = country;
		this.food = food;
		this.kindOf = kindOf;
        // 表示する
		System.out.println("こんにちは！ここは" + this.country + "です");
		System.out.println("この"+ this.food + "はうまい");
		System.out.println(this.food + "は" + this.kindOf + "です" );
        // 日時を取得する
		LocalDateTime date = LocalDateTime.now();
		//表示を変更		
		DateTimeFormatter dtFormat = 
		DateTimeFormatter.ofPattern("今の現在日時はyyyy/MM/dd H:m:sです");
		String formatDate1 = dtFormat.format(date);//表示形式+Stringに変換
		System.out.println(formatDate1);
	}
}
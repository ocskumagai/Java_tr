package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Introduce_sushi {
    // インスタンスの変数作成
	String greeting;
	String reputation;
	String kindOfSushi;
	
	public Introduce_sushi() {
        // インスタンス変数に文字を格納
		this.greeting = "こんにちは！ここは日本です！";
		this.reputation = "この寿司はうまい";
		this.kindOfSushi = "寿司は和食です";
        // 表示する
		System.out.println(this.greeting);
		System.out.println(this.reputation);
		System.out.println(this.kindOfSushi);
        // 日時を取得する
		LocalDateTime date = LocalDateTime.now();
		//表示を変更		
		DateTimeFormatter dtformat = 
		DateTimeFormatter.ofPattern("今の現在日時はyyyy/MM/dd H:m:sです");
			
		String formatdate1 = dtformat.format(date);//表示形式+Stringに変換
		System.out.println(formatdate1);
		
	}

}

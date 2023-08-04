package prefecture_info;

public class PrefectureData {
	/*一致したデータを取得するメソッド*/	
	public static String getCityData(Integer id) {
		// 空の変数を宣言
		String cityData = "";
		//受け取った値と一致した情報を取得し、変数に格納		
		switch (id) {
		case 0:
			cityData = "北海道:札幌市:83424";
			break;
		case 1:
			cityData = "青森県:青森市:9646";
			break;
		case 2:
			cityData = "岩手県:盛岡市:15275";
			break;
		case 3:
			cityData = "宮城県:仙台市:7282";
			break;
		case 4:
			cityData = "秋田県:秋田市:11638";
			break;
		case 5:
			cityData = "山形県:山形市:9323";
			break;		
		case 6:
			cityData = "福島県:福島市:13784";
			break;		
		case 7:
			cityData = "茨城県:水戸市:6097";
			break;		
		case 8:
			cityData = "栃木県:宇都宮市:6408";
			break;		
		case 9:
			cityData = "群馬県:前橋市:6362";
			break;		
		case 10:
			cityData = "埼玉県:さいたま市:3798";
			break;		
		}
		// 取得したデータを返す
		return cityData;
	}
}
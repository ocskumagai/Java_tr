package dsplayInfo;

import prefectureInfo.Data;
import prefectureInfo.InputScanner;
import prefectureInfo.PrefectureBean;

public class Main {

	public static void main(String[] args) {
		//	スキャナークラスのメソッドを呼び配列を返すかつ変数に受け取った配列を格納する	
		String[] idBox = InputScanner.InputData();
		//	拡張for文で配列を1つずつ取り出す	
		for (String id : idBox) {
			//	データクラスのデータを取得するメソッドを呼び、変数に格納する		
			String cityData = Data.getCityData(id);
			//	データを「:」で区切り、さらに配列に格納する　
			String[] cityInfo = cityData.split(":");
			//	それぞれの変数に配列の値を格納していく		
			String prefectureName = cityInfo[0];
			String mainCity = cityInfo[1];
			int area = Integer.parseInt(cityInfo[2]);
			//	変数をインスタンスの引数にセットし、インスタンスを生成する		
			PrefectureBean prefecture = new PrefectureBean(prefectureName, mainCity, area);
			//　生成したインスタンスで情報を表示するメソッドにアクセスする		
			prefecture.prefectureInfo();
		}

	}

}

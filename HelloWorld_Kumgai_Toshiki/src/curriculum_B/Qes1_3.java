package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[]args) {
		String checkName = null;
		String userName;
//		 ユーザー登録
		System.out.println("半角英数字のみで名前を入力してください");
		Scanner scanner = new Scanner(System.in);
		do {
			userName = scanner.nextLine();
			if (userName.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
			} else if ( userName == "" || userName.length() <= 0) {
				System.out.println("名前を入力してください");
			} else {
				System.out.println("ユーザ名" + userName + "を登録しました");
				checkName = "完了";
			}	
		}while(checkName == null);
		
		System.out.println("------------------------------");

//		じゃんけん配列を用意する
		String[] Hands = {"グー" , "チョキ" , "パー"};
//		勝つまでにかかった回数の変数作成
		int pt = 0;	
//		勝利判定のための変数
		String win = null;
//		対戦相手の作成
		Random r = new Random();
//		配列の値をランダムに取得
		String comHand = Hands[r.nextInt(3)];	
//		じゃんけんの選択
		do {
			System.out.println("0:グー　1:チョキ　2:パー　で選択してください");
			int playerHand = scanner.nextInt();
//		　　　　選択した値を表示
			System.out.println(userName + "の手は" + Hands[playerHand] );
			System.out.println("相手の手は" + comHand);
//			条件判定のためにuserHandとcomHandの文字列を連結
			String judge = Hands[playerHand] + comHand;
//			勝敗の表示
//			じゃんけんで勝った場合
		    if (judge.equals("グーチョキ") || judge.equals("チョキパー")|| judge.equals("パーグー") ) {
		    	System.out.println("やるやん。");
		    	System.out.println("次は俺にリベンジさせて");
		    	win = "win";
		    	pt++;
//		    	グーで負けた場合
		    } else if (judge.equals("グーパー")) {
		    	System.out.println("俺の勝ち!");
		    	System.out.println("負けは次につながるチャンスです!");
		    	System.out.println("ネバーギブアップ!");
		    	pt++;
//		    	チョキで負けた場合
		    } else if (judge.equals("チョキグー")) {
		    	System.out.println("俺の勝ち");
		    	System.out.println("たかがじゃんけん、そう思ってないですか？");
		    	System.out.println("それやったら次も、俺が勝ちますよ");
		    	pt++;
//		    	パーで負けた場合
		    } else if (judge.equals("パーチョキ") ) {
		    	System.out.println("俺の勝ち!");
		    	System.out.println("なんで負けたか、明日までに考えといてください。");
		    	System.out.println("そしたら何かが見えてくるはずです");
		    	pt++;
//		    	あいこの場合
		    } else {
		    	System.out.println("DRAW あいこ　もう一回しましょう!");
		    	pt++;
		    }	
		}while(win == null);
				
//		結果の表示
		System.out.println("勝つまでにかかった合計回数は" + pt + "回です");
		scanner.close();
	  }
	}



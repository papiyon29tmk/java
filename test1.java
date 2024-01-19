// Scannerクラスのインポート
import java.util.Scanner;

public class test1 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);
    // カウント変数を定義、0を代入する。
    int count = 0;
    // 計算結果を管理する整数型変数を宣言する。初期値は1。
    int num = 1;

    // コマンドプロンプトに"整数を入力してください"と表示する
    System.out.print("整数を入力してください：");
    // ユーザーに数を入力してもらう。int型に変換して変数targetに代入する
    int target = Integer.parseInt(stdIn.nextLine());


    // ユーザーに入力された数よりもnumが小さい間は繰り返す
    while (num < target){
      //numに2をかける
      num *= 2;
      //2を掛けた回数をカウントに1を足す
      count += 1;
    }
    //ループを抜けた = numがユーザーに入力された数より大きくなったということ
    //2を掛けた回数を表示する
    System.out.println("入力された数以上になるために、1に2を掛けた回数は"+count+"回です");
  }
}

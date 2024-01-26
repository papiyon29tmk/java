// Scannerクラスのインポート
import java.util.Scanner;

public class kouka5 {
  public static void main(String[] args) {
    try (Scanner stdIn = new Scanner(System.in)) {
      // 教科数
      final int SUBJECTS = 5;
      int[] scores = new int[SUBJECTS];
      // 合計点を管理する変数
      int total = 0;
      // 平均点を管理する変数
      double average = 0.0;
      // 教科の点数を入力
      for (int i = 0; i < SUBJECTS; i++) {
        // 入力
        System.out.print((i + 1) + "教科目の点数を入力してください：");
        // 入力された点数を変数に代入する
        int score = Integer.parseInt(stdIn.nextLine());
        // 点数が0~100の範囲内かチェックする
        if (score >= 0 && score <= 100) {
          // 範囲内なら配列に格納する
          scores[i] = score;
        } else {
          // 範囲外ならエラーメッセージを表示し、0点とする
          System.out.println("不正な点数を検知しました。0点とします。");
          scores[i] = 0;
        }
      }
      total = Total(scores);
      average = Average(total, SUBJECTS);
      // 合計点と平均点を表示する
      System.out.println("合計点 = " + total);
      System.out.println("平均点 = " + average);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }

  // 合計点を計算
  public static int Total(int[] scores) {
    // 合計点を管理する変数
    int total = 0;
    // 配列の要素数分繰り返す
    for (int score : scores) {
      // 合計点に点数を加算する
      total += score;
    }
    // 合計点を返す
    return total;
  }

  // 平均点を計算
  public static double Average(int total, int subjects) {
    // 平均点の変数
    double average = 0.0;
    // 合計点を教科数で割って平均点を求める
    average = (double) total / subjects;
    // 平均点を返す
    return average;
  }
}

package kyotu;
import java.util.Scanner;
// Calculatorクラスの定義
class Calculator {
  // 2つの引数の合計値を返すメソッド
  int calcSum(int x, int y) {
    return x + y;
  }
  // 2つの引数の平均値を返すメソッド
  double calcAve(int x, int y) {
    return (x + y) / 2.0;
  }
}

// MoreCalcクラスの定義（Calculatorクラスを継承）
class MoreCalc extends Calculator {
  // 引数の累乗を求めて返すメソッド
  int calcPow(int x, int y) {
    int result = 1;
    for (int i = 0; i < y; i++) {
      result = result * x;
    }
    return result;
  }
}

// メインクラス
class Calcmain {
  public static void main(String[] args) {
    // MoreCalcクラスのインスタンスを生成
    MoreCalc mc = new MoreCalc();
    // 入力を受け取る
    System.out.print("整数を入力してください：");
    int x = new Scanner(System.in).nextInt();
    System.out.print("整数を入力してください：");
    int y = new Scanner(System.in).nextInt();
    // 合計値、平均値、累乗を計算して表示する
    System.out.println("Sum " + x + " and " + y + " = " + mc.calcSum(x, y));
    System.out.println("Average " + x + " and " + y + " = " + mc.calcAve(x, y));
    System.out.println("Power " + x + " of " + y + " = " + mc.calcPow(x, y));
  }
}

package kyotu;
import java.util.Scanner;

class Q15_1 {
  public static void main(String[] args) {
    // Scannerクラスのオブジェクトを作成する
    Scanner sc = new Scanner(System.in);
    // 2つの整数を入力
    System.out.print("整数 1 = ");
    int num1 = sc.nextInt();
    System.out.print("整数 2 = ");
    int num2 = sc.nextInt();
    // 割り算を実行する
    try {
      double result = num1 / num2;
      // 割り算の結果を画面に表示する
      System.out.println(num1 + " / " + num2 + " = " + result);
    } catch (ArithmeticException e) {
      // 0除算例外を補足してメッセージを画面に表示する
      System.out.println("0による割り算です！！");
    }
    // 処理終了を画面に表示する
    System.out.println("処理終了");
  }
}

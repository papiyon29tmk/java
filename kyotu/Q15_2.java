package kyotu;
import java.util.InputMismatchException;
import java.util.Scanner;

class Q15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("整数を入力 = ");
            int number = scanner.nextInt(); // 整数を直接読み込む

            // 偶数か奇数か判定して結果を表示
            if (number % 2 == 0) { // 変数を使わずに判定
                System.out.println(number + " は偶数");
            } else {
                System.out.println(number + " は奇数");
            }
        } catch (NumberFormatException e) {
            System.out.println("整数と認識できません！！");
        } catch (InputMismatchException e) {
            System.out.println("整数と認識できません！！");
        } finally {
            scanner.close();
        }
    }
}

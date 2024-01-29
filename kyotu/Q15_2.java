package kyotu;
import java.util.InputMismatchException;
import java.util.Scanner;

class Q15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("整数を入力 = ");
            double inputNumber = scanner.nextDouble();

            // 入力が整数かどうか判定
            if (inputNumber % 1 == 0) {
                int number = (int) inputNumber;

                // 偶数か奇数か判定して結果を表示
                if (number % 2 == 0) {
                    System.out.println(number + " は偶数");
                } else {
                    System.out.println(number + " は奇数");
                }
            } else {
                System.out.println("整数と認識できません！！");
            }
        } catch (InputMismatchException e) {
            System.out.println("整数と認識できません！！");
        } finally {
            scanner.close();
        }
    }
}

package kyotu;
import java.util.Scanner;
class num {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字の入力：");
        String s = stdIn.next(); // 文字を入力

        System.out.print("整数の入力：");
        int i = stdIn.nextInt(); // 整数を入力

        System.out.print("少数の入力：");
        double d = stdIn.nextDouble(); // 少数を入力

        System.out.println("入力された文字は" + s + "です");
        System.out.println("入力された整数は" + i + "です");
        System.out.println("入力された少数は" + d + "です");
    }
}

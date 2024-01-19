package kyotu;
import java.util.Scanner;
class Q5_1 {
    public static void main(String[] args) {
        // ユーザーに入力させる値
        System.out.print("A～Dの値を入力してください：");
        Scanner scanner = new Scanner(System.in);
        char userInput = scanner.next().charAt(0);
        //switch文で処理
        switch (userInput) {
            case 'A':
            System.out.println("ランクAは評価「優」です");
            break;
            case 'B':
            System.out.println("ランクBは評価「良」です");
            case 'C':
            System.out.println("ランクCは評価「可」です");
            break;
            case 'D':
            System.out.println("ランクDは評価「不可」です");
            break;
        }
        scanner.close();

    }
}

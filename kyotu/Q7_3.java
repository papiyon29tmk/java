package kyotu;
import java.util.Scanner;
class Q7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //入力された値を格納する変数
        int input = 0;
        //反転した値を格納する変数を定義
        int reverse = 0;
        System.out.print("整数値を入力：");
        //入力された値を変数inputに代入
        input = sc.nextInt();
        do {
            //reverseを１０で割って桁をずらす
            reverse *= 10;
            //reverseに一の位を加算
            reverse += input % 10;
            //inputを10で割って一の位を切り捨てる
            input /= 10;
            //inputが０になるまで繰り返す
        } while (input > 0);
        System.out.println(
            reverse
        );
    }
}

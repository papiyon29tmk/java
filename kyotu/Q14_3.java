package kyotu;
// StringBuilder = 文字列の連結を+せずにできる

import java.util.Scanner;
class Q14_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String input = sc.nextLine();
        // StringBuilderクラスのインスタンスを作成
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        // StringBuilderの文字数が11文字以上の場合
        if (sb.length() >= 11) {
            // 11文字目以降を削除
            sb.delete(10, sb.length());
        }

        // 結果文字列を変数に格納
        String result = sb.toString();
        // 結果文字列を画面に表示
        System.out.println("結果文字列：" + result);
    }
}


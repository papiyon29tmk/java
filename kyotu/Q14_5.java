package kyotu;

import java.lang.StringBuilder;
class Q14_5 {
    public static void main(String[] args) {
        String str1 = "東京都千代田区";
        String str2 = "神田神保町";
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        // StringBuilderを文字列に変換する
        String result = sb.toString();
        System.out.println(result);
    }
}

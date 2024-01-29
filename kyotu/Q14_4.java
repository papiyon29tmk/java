package kyotu;
import java.util.Scanner;
public class Q14_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字列を2つ入力してください。");
        System.out.print("1つ目の文字列を入力：");
        String str1 = scanner.nextLine();
        System.out.print("2つ目の文字列を入力：");
        String str2 = scanner.nextLine();
        // equalsでstr1とstr2を比較
        if (str1.equals(str2)) {
            System.out.println("同じ文字列です。");
        } else {
            System.out.println("違う文字列です。");
        }
    }
}

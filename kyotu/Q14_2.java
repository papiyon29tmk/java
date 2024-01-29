package kyotu;
import java.util.Scanner;

public class Q14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力:");
        String str = scanner.nextLine();
        int count = str.length();
        System.out.println("入力された文字数は" + count + "です。");
    }
    
}
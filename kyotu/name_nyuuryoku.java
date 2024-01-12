package kyotu;
import java.util.Scanner;
class name_nyuuryoku {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in,"Shift-Jis");
    System.out.print("お名前を入力してください>");
    String str = stdIn.nextLine();
    System.out.println("こんにちは" + str + "さん");
  }
}

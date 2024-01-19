package kyotu;

import java.util.Scanner; // Scannerをインポートする

public class Q9_1 {
    
    // 学校名と名前を表示する関数
    static void SchoolAndName(String school, String name) {
        System.out.println("学校: " + school);
        System.out.println("名前: " + name);
    }

    public static void main(String[] args) {
        // Scannerのインスタンスを作る
        Scanner sc = new Scanner(System.in);

        // 学校名と名前を入力
        System.out.print("学校名を入力してください: ");
        String School = sc.nextLine(); // 学校名を読み込む
        System.out.print("名前を入力してください: ");
        String Name = sc.nextLine(); // 名前を読み込む

        // 関数を呼び出して学校名と名前を表示
        SchoolAndName(School, Name);
    }
}

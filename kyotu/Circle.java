package kyotu;
import java.util.Scanner;
class Circle {
    // 円周率の定義
    double PI = 3.1415;
    // 半径
    private double radius;
    // コンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }
    // 円周の長さを求めるメソッド
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
    // 円の面積を求めるメソッド
    public double calculateArea() {
        return PI * radius * radius;
    }
}
class Circlemain {
    public static void main(String[] args) {
        // ユーザーから半径を入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("半径を整数値で入力：");
        double radius = scanner.nextDouble();
        // Circleクラスのインスタンスを作成
        Circle circle = new Circle(radius);
        // 円周の長さを求
        double circumference = circle.calculateCircumference();
        System.out.println("円周の長さは" + circumference + "です。");
        // 面積を求めて表示
        double area = circle.calculateArea();
        System.out.println("円の面積は" + area + "です.");
        // Scannerを閉じる
        scanner.close();
    }
}
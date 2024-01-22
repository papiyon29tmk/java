package kyotu;
// 演算実行クラスの定義
class Calculation {
    // クラス変数としてXとYを定義
    public static int X;
    public static int Y;

    // XからYまでの合計値を求めるメソッド
    public static int sum() {
        // 合計値を格納する変数を初期化
        int total = 0;
        // XからYまでのループ
        for (int i = X; i <= Y; i++) {
            // 合計値にiを加算
            total += i;
        }
        // 合計値を返す
        return total;
    }
}

// メインクラスの定義
class Calculation2 {
    public static void main(String[] args) {
        // XとYに値を代入
        Calculation.X = 100;
        Calculation.Y = 200;

        // XからYまでの合計値を求める
        int result = Calculation.sum();

        // 結果を出力する
        System.out.println(Calculation.X + "から" + Calculation.Y + "までの合計値は" + result + "です。");
    }
}

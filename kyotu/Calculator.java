package kyotu;
class Calculator {
    int x;
    int y;
    //コンストラクタ
    Calculator(int x, int y) {
        //xとyに値を代入する
        //thisを使い、コンストラクタの処理を共通化
        this.x = x;
        this.y = y;
    }
    // xからyまでの合計値を求めるメソッド
    int sum() {
        int total = 0;
        // x,y roup
        for (int i = x; i <= y; i++) {
            //合計値にiを加える
            total += i;
        }
        return total;
    }
}
// メイン処理
class main_ {
    public static void main(String[] args) {
        // インスタンスを作成
        Calculator calc = new Calculator(100, 200);
        // 合計を求める
        int result = calc.sum();
        System.out.println(calc.x + "から" + calc.y + "までの合計値は" + result + "です");
    }
}
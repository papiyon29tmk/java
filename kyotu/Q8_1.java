package kyotu;

public class Q8_1 {
    public static void main(String[] args) {
        // 要素が10個の配列を作成
        int[] numbers = new int[10];

        // 配列に1から10までの値を格納
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }

        // 配列の値を画面に表示
        for (int i = 0; i < 10; i++) {
            System.out.println("list[" + i + "] = " + numbers[i]);
        }
    }
}


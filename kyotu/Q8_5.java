package kyotu;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Q8_5 {
    public static void main(String[] args){

        /* 要素数が5のリストを作成し、全要素の合計値と平均値を表示する */
        /* 整数値リスト */
    	List<Integer> list = Arrays.asList(10, 20, 30, 40, 50); // 任意の数値のリストを作成
        int sum=0;

        /* 合計値を表示 */
        for(int num : list){ // リストの要素数分繰り返す
            sum += num; // 各要素を合計に加える
        }
    	// 合計を出力
        System.out.println("合計値は" + sum + "です。");

        // 平均を出力
        System.out.println("平均値は" + (double)sum / list.size() + "です。");
    }
}

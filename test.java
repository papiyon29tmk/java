import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class test {
    public static void main(String[] args) {
        // Scannerクラスのインスタンス化
        Scanner stdIn = new Scanner(System.in);
        // クラスの人数を入力してもらう
        System.out.print("クラスの人数を入力して下さい:");
        int num = Integer.parseInt(stdIn.nextLine());
        // arrayList型の変数listを宣言し、空のarrayListを代入する
        ArrayList<Integer> list = new ArrayList<Integer>();
            // クラスの人数分の年齢を入力してもらい、listに追加する
    for(int i = 0;i < num; i++){
        // 入力を促す文字列を表示する
        System.out.print((i+1)+"人目の年齢を入力して下さい：");
        // 入力してもらった年齢をリストに格納する
        list. add(Integer.parseInt(stdIn.nextLine()));
      }
      // 年齢の合計を管理する変数sumを宣言し、0で初期化する
      int sum = 0;
      //listに格納されている年齢の平均を求める
      for(int i = 0;i < num; i++){
        // listの年齢を取り出し、sumの中に足していく
        sum = sum + list. get (i);

      }
      //平均年齢を管理する変数aveを宣言し、平均年齢を計算し、代入する
      double ave = (double)sum / num;
      //平均年齢を表示する
      System.out.println("クラスの平均年齢は、"+ave+"歳です。");
  //---------------------------------------------------------------------//
      // HashMap型の変数mapを宣言し、空のHashMapを代入する。
      HashMap<String,Integer> map = new HashMap<String,Integer>();
      // キーとして先生の名前を、値としてその人の年齢をmapを格納する
      map.put("江藤",34);
      map.put("加藤",27);
      map.put("佐藤",29);
      map.put("伊藤",42);
      map.put("後藤",38);
      // 先生の平均年齢を計算するので、合計する為の変数sum2を宣言し、0で初期化する
      int sum2 = 0;
      // 拡張for文を用いて、各先生の名前と年齢を表示する
      for(String name: map.keySet()){
        // 合計に年齢を足し込む
        sum2 += map.get(name);
        // 先生の名前と年齢を表示する
        System.out.println("名前：" + name + "先生 年齢：" + map.get(name));
      }
      //平均年齢を管理する変数aveを宣言し、平均年齢を計算し、代入する
      double ave2 = (double)sum2 / map.size();
      // 最後に平均年齢を計算し、表示する
      System.out.println("先生の平均年齢は、"+ ave2 +"歳です。");
    }
  }
  
    


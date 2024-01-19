import java.util.*;
class Sample1_18 {
    public static void main(String[] args) {

        //マップを宣言
        Map<String, String> map = new HashMap<>();
        //要素を追加
        map.put("東京都", "新宿区");
        map.put("千葉県", "千葉市");
        map.put("神奈川県", "横浜市");
        map.put("埼玉県", "さいたま市");
        //キーが存在するか確認する
        System.out.println("東京都:" + map.containsKey("東京都"));
        //値が存在するか確認する
        System.out.println("新宿区:" + map.containsValue("新宿区"));
        //キーを削除する
        map.remove("埼玉県");
        System.out.println("埼玉県:" + map.containsKey("埼玉県"));
        //キーを置き換える
        map.replace("神奈川県", "栃木県");
        System.out.println("栃木県:" + map.containsKey("栃木県"));
        //マップの要素数を確認する
        System.out.println("要素数:" + map.size());
    }
}

package kyotu;

class Q7_4 {
    public static void main(String[] args) {
        int n = 1;//nの初期値
        int sum = 0;//合計の初期値
        while (sum < 100000) {//合計が100000以下なら繰り返す
            sum += n;
            /* 100000以下の場合はnを1増やす */
            if (sum < 100000){
                n++;
            }
        }

        System.out.println("合計が100000を超えるnは" + n + "です");
    }
}

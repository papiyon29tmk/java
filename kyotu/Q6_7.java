package kyotu;

class Q6_7 {
    public static void main(String[] args) {
        //1~9の段を繰り返す
        for (int i = 1; i <= 9; i++) {
            //?の段という文字列を表示
            System.out.println(i + "の段");
            //1~9繰り返す
            for (int j = 1; j <= 9; j++) {
                //式を表示
                System.out.println(i + "*" + j + "=" + (i + j) + " ");
        }
        //改行
        System.out.println();
        }
    }
}

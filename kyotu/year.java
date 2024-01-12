package kyotu;

import java.util.Scanner;

class Year {
    public static void main(String[] args) {
          Scanner stdIn = new Scanner(System.in);
        System.out.print("年：");
        int s = stdIn.nextInt(); 

        System.out.print("月：");
        int i = stdIn.nextInt();

        System.out.print("日：");
        int d = stdIn.nextInt(); 

        System.out.println(s + "/" + i + "/" + d);
    }
}

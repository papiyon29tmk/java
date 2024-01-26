import java.util.Scanner;

class Rangeerror extends RuntimeException {
    Rangeerror(int n) { super("範囲外の値：" + n); }
}

class ParameterRangeerror extends Rangeerror {
    ParameterRangeerror(int n) { super(n); }
}

class ResultRangeerror extends Rangeerror {
    ResultRangeerror(int n) { super(n); }
}

class RangeerrorTester {
    static boolean isValid(int n) {
        return n >= 0 && n <= 9;
    }

    static int add(int a, int b) throws ParameterRangeerror, ResultRangeerror {
        if (!isValid(a)) throw new ParameterRangeerror(a);
        if (!isValid(b)) throw new ParameterRangeerror(b);
        int result = a + b;
        if (!isValid(result)) throw new ParameterRangeerror(result);
        return result;
    }

    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("整数a:"); int a = stdIn.nextInt();
            System.out.print("整数b:"); int b = stdIn.nextInt();

            try {
                System.out.println("それらの和は" + add(a, b) + "です");
            } catch (ParameterRangeerror e) {
                System.out.println("加える数が範囲外です" + e.getMessage());
            } catch (ResultRangeerror e) {
                System.out.println("計算結果が範囲外です" + e.toString());
            }
        }
        
    }
}

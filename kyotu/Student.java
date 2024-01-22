package kyotu;

// 学生情報を保持するStudentクラスの定義
class Student {
    // フィールド（名前、学生番号、3教科のテスト結果）
    private String name;
    private int number;
    private int japanese;
    private int math;
    private int english;
  
    // コンストラクタ（引数として名前、学生番号、3教科のテスト結果を受け取る）
    public Student(String name, int number, int japanese, int math, int english) {
      this.name = name;
      this.number = number;
      this.japanese = japanese;
      this.math = math;
      this.english = english;
    }
  
    // 3教科の平均点を算出するメソッド（小数点第三位切り捨て）
    public double calcAverage() {
      // 3教科の合計点を求める
      int sum = japanese + math + english;
      // 3教科の平均点を求める（小数点第三位切り捨て）
      double average = Math.floor(sum / 3.0 * 100) / 100;
      // 平均点を返す
      return average;
    }
  
    // 3教科の合計点を算出するメソッド
    public int calcSum() {
      // 3教科の合計点を求める
      int sum = japanese + math + english;
      // 合計点を返す
      return sum;
    }
  
    // 名前を取得するメソッド
    public String getName() {
      return name;
    }
  
    // 学生番号を取得するメソッド
    public int getNumber() {
      return number;
    }
  }
  
  // メインクラス
class Main {
    public static void main(String... args) {
      // 学生情報の配列を作成する
      Student[] students = new Student[3];
      // 配列に学生情報を代入する
      students[0] = new Student("Aさん", 001, 89, 65, 88);
      students[1] = new Student("Bさん", 002, 80, 95, 64);
      students[2] = new Student("Cさん", 003, 70, 80, 98);
      // 配列の要素を順に処理する
      for (Student student : students) {
        // 学生番号、名前、平均点を画面に表示する
        System.out.println(student.getNumber() + "番 " + student.getName() + " 平均点" + student.calcAverage());
      }
    }
  }
  
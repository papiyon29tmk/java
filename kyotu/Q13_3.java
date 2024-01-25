package kyotu;
interface Person_13_3 {
    void introduce();
  }
  
  // Personクラスを継承した教師の情報を管理するTeacherクラス
  class Teacher_13_3 implements Person_13_3 {
    // フィールド（担当科目）
    private String subject;
    private String name;
    private String job;
  
    // コンストラクタ（引数として氏名、職業、担当科目を受け取る）
    public Teacher_13_3(String name, String job, String subject) {
      // 親クラスのコンストラクタを呼び出す
      this.name = name;
      this.job = job;
      this.subject = subject;
    }
  
    // 自身の情報を画面に表示するintroduceメソッド（親クラスのメソッドをオーバーライド）
    public void introduce() {
      // 親クラスのメソッドを呼び出す
      System.out.println("氏名：" + name);
      System.out.println("職種：" + job);
      System.out.println("担当科目：" + subject);
    }
  }
  
  // Personクラスを継承したコックの情報を管理するCookクラス
  class Cook_13_3 implements Person_13_3 {
    // フィールド（得意料理）
    private String specialty;
    private String name;
    private String job;
  
    // コンストラクタ（引数として氏名、職業、得意料理を受け取る）
    public Cook_13_3(String name, String job, String specialty) {
      // 親クラスのコンストラクタを呼び出す
      this.name = name;
      this.job = job;
      this.specialty = specialty;
    }
  
    public void introduce() {
      System.out.println("氏名：" + name);
      System.out.println("職種：" + job);
      System.out.println("得意料理：" + specialty);
    }
  }
  
  // メインクラス
class Q13_3 {
    public static void main(String[] args) {
      // Teacherクラスのインスタンスを生成する
      Teacher_13_3 teacher = new Teacher_13_3("竹井一馬", "教員", "情報処理\n");
      // 自身の情報を画面に表示する
      teacher.introduce();
  
      // Cookクラスのインスタンスを生成する
      Cook_13_3 cook = new Cook_13_3("大原太郎", "シェフ", "オムライス");
      // 自身の情報を画面に表示する
      cook.introduce();
    }
  }
  
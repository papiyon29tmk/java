package kyotu;
class Person_o_yo {
    // フィールド（氏名と職業）
    private String name;
    private String job;
  
    // コンストラクタ（引数として氏名と職業を受け取る）
    public Person_o_yo(String name, String job) {
      this.name = name;
      this.job = job;
    }
  
    // 自身の情報を画面に表示するintroduceメソッド
    public void introduce() {
      System.out.println("氏名：" + name);
      System.out.println("職種：" + job);
    }
  }
  
  // Personクラスを継承した教師の情報を管理するTeacherクラス
  class Teacher_o_yo extends Person_o_yo {
    // フィールド（担当科目）
    private String subject;
  
    // コンストラクタ（引数として氏名、職業、担当科目を受け取る）
    public Teacher_o_yo(String name, String job, String subject) {
      // 親クラスのコンストラクタを呼び出す
      super(name, job);
      this.subject = subject;
    }
  
    // 自身の情報を画面に表示するintroduceメソッド（親クラスのメソッドをオーバーライド）
    public void introduce() {
      // 親クラスのメソッドを呼び出す
      super.introduce();
      System.out.println("担当科目：" + subject);
    }
  }
  
  // Personクラスを継承したコックの情報を管理するCookクラス
  class Cook_o_yo extends Person_o_yo {
    // フィールド（得意料理）
    private String specialty;
  
    // コンストラクタ（引数として氏名、職業、得意料理を受け取る）
    public Cook_o_yo(String name, String job, String specialty) {
      // 親クラスのコンストラクタを呼び出す
      super(name, job);
      this.specialty = specialty;
    }
  
    // 自身の情報を画面に表示するintroduceメソッド（親クラスのメソッドをオーバーライド）
    public void introduce() {
      // 親クラスのメソッドを呼び出す
      super.introduce();
      System.out.println("得意料理：" + specialty);
    }
  }
  
  // メインクラス
class Main_o_yo {
    public static void main(String[] args) {
      // Teacherクラスのインスタンスを生成する
      Teacher_o_yo teacher = new Teacher_o_yo("竹井一馬", "教員", "情報処理\n");
      // 自身の情報を画面に表示する
      teacher.introduce();
  
      // Cookクラスのインスタンスを生成する
      Cook_o_yo cook = new Cook_o_yo("大原太郎", "シェフ", "オムライス");
      // 自身の情報を画面に表示する
      cook.introduce();
    }
  }
  
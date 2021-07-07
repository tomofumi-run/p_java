public class Human01 { //アクセス修飾子[public]を用いてどこからでもアクセス可能
  public String name;
  public int age; //変数nameとageを定義

  public Human01() { //引数なしのコンストラクトの初期値をセット
    name ="山田";
    age = 20;
  }

  public Human01(String name, int age) { //引数が2つのコンストラクトを定義
    this.name = name;
    this.age = age;
  }
}
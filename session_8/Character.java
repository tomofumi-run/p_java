public abstract class Character { // 抽象クラスでインスタンス化を防ぐ
  String name;
  int hp;
  // 逃げる
  public void run(){
    System.out.println(this.name + "は、逃げ出した。");
  }

  // 戦う 詳細未定なので抽象メソッドとして定義する
  public abstract void attack(Matango m);
}
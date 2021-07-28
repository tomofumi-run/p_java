public class Hero {
  String name;
  int hp;
  Sword sword;
  static int money = 1000; // Hero.moneyで呼び出し可能

  void attack(){
    System.out.println(this.name + "は攻撃をした！");
    System.out.println("敵に5のダメージを与えた");
  }

  void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した！");
  }
  void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ");
  }
  void run(){
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("Game Over...");
    System.out.println("最終HPは" + this.hp + "でした。");
  }
  Hero(String name){ // 引数指定
    this.hp = 100; // デフォルト値を設定
    this.name = name;
  }
}
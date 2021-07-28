import java.util.*;

public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println(this.name + "のセルフエイド。\nMPを5消費してHPを" + this.MAX_HP + "まで回復した。");
  }
  public int pray(int sec){
    int recover = new Random().nextInt(3) + sec; // 例) 0~2の乱数とsecを足す
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover); // Math.min二つの引数で小さい値を返す

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した。" + this.mp );
    return recoverActual;

  }
}
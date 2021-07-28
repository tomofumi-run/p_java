import java.util.*;
static final int MAX_HP = 50; // 最大数は変化しないのでフィール外で定義している。
static final int MAX_MP = 10;

public class Cleric {
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
  public Cleric(String name, int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  public Cleric(String name, int hp){
    this(name, hp, Cleric.MAX_HP);
  }
  Cleric(String name){
    this(name, Cleric.MAX_HP);
  }
}
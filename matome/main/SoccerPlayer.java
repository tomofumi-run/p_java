public class SoccerPlayer{
  String name;
  int stamina = 100;
  int speed;
  int kick;

  void call(){
    System.out.println(this.name + "選手を登録しました。");
    System.out.println("スタミナは" + this.stamina);
    System.out.println("スピードは" + this.speed);
    System.out.println("キック力は" + this.kick);
  }

  void haste(){
    this.stamina -= 20;
    this.speed += 10;
    System.out.println(this.name + "選手は速攻に出た。\nスタミナが20減った。\nスピードが10上がった。");
  }

  void toChallenge(int courage){
    this.kick += courage;
    System.out.println(this.name + "選手は勇気を出して挑戦した。\nキック力が" + courage+ "アップした。");
  }

}
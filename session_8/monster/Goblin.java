public class Goblin extends WalkingMonster {
  public void attack(){
    System.out.println(this.name + "はナイフで斬りつけた！");
  }
  public Goblin(String name){
    this.name = name;
  }
}
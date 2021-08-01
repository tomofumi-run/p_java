public class Goblin extends WalkingMonster {
  public void attack(){
    System.out.println(this.name + "はナイフで斬りつけた！");
  }

  public void run(){
    System.out.println(this.name + "は腕を振りながら全速力で逃げた");
  }

  public Goblin(String name){
    this.name = name;
  }
}
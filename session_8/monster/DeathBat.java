public class DeathBat extends FlyingMonster {
  public void attack(){
    System.out.println(this.name + "の吸血！");
  }

  public void run(){
    System.out.println(this.name + "は激しく羽を羽ばたかせて逃げた");
  }

  public DeathBat(String name){
    this.name = name;
  }
}
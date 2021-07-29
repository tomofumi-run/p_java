public class DeathBat extends FlyingMonster {
  public void attack(){
    System.out.println(this.name + "の吸血！");
  }
  public DeathBat(String name){
    this.name = name;
  }
}
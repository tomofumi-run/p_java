public class WarWolf extends WalkingMonster {
  public void attack(){
    System.out.println(this.name + "のかみつき！");
  }
  public WarWolf(String name){
    this.name = name;
  }
}
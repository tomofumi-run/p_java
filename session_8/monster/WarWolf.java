public class WarWolf extends WalkingMonster {
  public void attack(){
    System.out.println(this.name + "のかみつき！");
  }

  public void run(){
    System.out.println(this.name + "はキャンキャン言いながら逃げた");
  }

  public WarWolf(String name){
    this.name = name;
  }
}
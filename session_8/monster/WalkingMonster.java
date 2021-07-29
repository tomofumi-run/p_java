public abstract class WalkingMonster extends Monster{
  public abstract void attack();

  public void run(){
    System.out.println(this.name + "は走って逃げた！");
  }
}
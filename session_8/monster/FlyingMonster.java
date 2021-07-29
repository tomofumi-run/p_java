public abstract class FlyingMonster extends Monster{
  public abstract void attack();

  public void run(){
    System.out.println(this.name + "はバサバサ飛んで逃げた！");
  }
}
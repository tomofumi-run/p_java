public abstract class Human {
  private String name;
  private int money;

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getMoney(){
    return this.money;
  }
  public void setMoney(int money){
    this.money = money;
  }

  public abstract void call();
}
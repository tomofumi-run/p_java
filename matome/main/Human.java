public class Human {
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

  public void call(){
    System.out.println("私の名前は、" + getName() + "\n給料は、"+ getMoney() + "なり。");
  }
}
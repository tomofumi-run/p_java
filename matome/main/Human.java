public abstract class Human implements Animal {
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

  public void run(){
    System.out.println("走ると疲れるな。");
  }
  public void eat(){
    System.out.println("ラーメンうま。");
  }
  public void sleep(){
    System.out.println("体動かして、飯食うと、眠くなるで。");
  }
}
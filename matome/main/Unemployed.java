public class Unemployed extends Human{
  public Unemployed(String name, int money){
    setName(name);
    setMoney(money);
  }

  public void troublesome(){
    System.out.println("働いたら負けだと思ってます。");
  }
}
public class Engineer extends Human{
  public Engineer(String name, int money){
    setName(name);
    setMoney(money);
  }

  public void assemble(){
    System.out.println("コードを書きます。");
  }
}
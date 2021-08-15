public class Teacher extends Human{

  public Teacher(String name, int money){
    setName(name);
    setMoney(money);
  }

  public void teach(){
    System.out.println("優しく教えます。");
  }
}
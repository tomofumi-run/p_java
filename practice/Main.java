public class Main {
  public static void main(String[] args){
    Human h = new Human();
    Engineer e = new Engineer();
    e.setName("エンジニア");
    e.setAge(28);
    e.setSex('男');
    e.getName();
    e.doCal();
    e.goodBye();

    // h.getName();
    // h.getAge();
    // h.getSex();
    // h.goodBye();

  }
}
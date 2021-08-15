public class Main{
  public static void main(String[] args){
    Teacher t = new Teacher("ほげ先生", 200000);
    Engineer e = new Engineer("ほげSE", 150000);
    Unemployed u = new Unemployed("ほげニート", 0);
    t.call();
    e.call();
    u.call();

    t.teach();
    e.assemble();
    u.troublesome();
  }
}
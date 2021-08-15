public class Main{
  public static void main(String[] args){
    Teacher t = new Teacher("ほげ先生", 200000);
    Engineer e = new Engineer("ほげSE", 150000);
    Unemployed u = new Unemployed("ほげニート", 0);
    t.call();
    t.teach();

    e.call();
    e.assemble();
    
    u.call();
    u.troublesome();

  }
}
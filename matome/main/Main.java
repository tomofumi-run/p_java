public class Main{
  public static void main(String[] args){
    // Human h = new Human();
    // System.out.println(h.getName());
    // System.out.println(h.getAge());
    
    Human h = new Human();
    System.out.println(h.name);
    System.out.println(h.age);
    h.name = "おじい";
    h.age = 100;
    System.out.println(h.name);
    System.out.println(h.age);
  }
}
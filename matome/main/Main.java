public class Main{
  public static void main(String[] args){
    Human h = new Human();
    System.out.println(h.getName());
    System.out.println(h.getAge());

    h.setName("成人");
    h.setAge(20);

    System.out.println(h.getName());
    System.out.println(h.getAge());
  }
}
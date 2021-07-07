public class ClassMethod04 {
  public static void main(String args[]){
    Human04 nakagawa = new Human04("中川");
    Human04 tomo = new Human04("とも");
    Human04.staticMethodPrint();

    System.out.println(Human04.GREETING);

    nakagawa.instanceMethodPrint();
  }
}
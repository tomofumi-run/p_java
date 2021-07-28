public class God {
  public static void main(String[] args){
    Hero h = new Hero("勇者ヨシヒコ");
    Wizard w = new Wizard();
    System.out.println(h.name + "のHPは、現在" + h.hp + " 所持金は" + Hero.money);
  }
}
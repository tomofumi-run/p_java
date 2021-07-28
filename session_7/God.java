public class God {
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ヨシヒコ";
    h.hp = 100;

    Matango m1 = new Matango();
    m1.suffix = 'A';
    m1.hp = 50;
    Matango m2 = new Matango();
    m2.suffix = 'B';
    m2.hp = 20;

    Cleric c = new Cleric();
    c.name = "ホーリーエルフ";

    System.out.println("勇者"+ h.name + "を生み出した。");
    System.out.println("女神"+ c.name + "を生み出した。");
    h.slip();
    c.selfAid();
    m1.run();
    c.pray(5);
    m2.run();
    h.run();
  }
}
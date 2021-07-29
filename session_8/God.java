public class God {
  public static void main(String[] args){
    Hero h = new Hero();
    Dancer d = new Dancer();
    Matango m = new Matango('A');
    h.name = "勇者";
    d.name = "ダンサー";
    h.attack(m);
    d.attack(m);
  }
}
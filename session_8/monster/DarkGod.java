public class DarkGod {
  public static void main(String[] args){
    WarWolf w = new WarWolf("狼男");
    Goblin g = new Goblin("ゴブリン");
    DeathBat d = new DeathBat("吸血こうもり");

    w.attack();
    w.run();
    g.attack();
    g.run();
    d.attack();
    d.run();
  }
}
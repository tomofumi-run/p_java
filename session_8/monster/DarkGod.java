public class DarkGod {
  public static void main(String[] args){
    Monster[] monsters = new Monster[3]; // あいまいさはあるが、モンスターを3体召喚する

    monsters[0] = new Goblin("ゴブリン"); // 1体目はゴブリン
    monsters[1] = new DeathBat("吸血こうもり"); // 2体目は吸血こうもり
    monsters[2] = new WarWolf("狼男"); // 3体目は狼男
// 配列として抽象クラスを作成し、その後に具体化していく

    for(Monster m : monsters){ // mにmonstersの情報を割り振って繰り返し
      m.run();
    }
  }
}
public class Weapon extends Item { // itemインスタンスには空のコンストラクタを許容するものがない引数が必要
  public Weapon(){
    super("ななしの剣"); // 引数1の親クラスのコンストラクタを呼び出している
  }
}
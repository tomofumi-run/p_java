public class Main {
  public static void main(String[] args){
    String[] pokes = {"ピカチュウ", "ヒトカゲ", "ゼニガメ", "フシギダネ"};
    System.out.println("さぁ、どのポケモンにするんじゃ？");
    for(String poke: pokes){
      System.out.println(poke);
    }
    System.out.println(pokes[0] + "、君に決めた！");
  }
}
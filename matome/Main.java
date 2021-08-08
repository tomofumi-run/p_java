public class Main {
  public static void main(String[] args){
    String[] pokes = {"ピカチュウ", "ヒトカゲ", "ゼニガメ", "フシギダネ"};
    System.out.println("オーキド博士からもらえるポケモンの名前を一体答えなさい。");
    String input = new java.util.Scanner(System.in).nextLine();
    for(String poke: pokes){
      if(input.equals(poke)){
        System.out.println("あなたの答え:" + input + " 正解じゃ♪");
      }
    }
  }
}
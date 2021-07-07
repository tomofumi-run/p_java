public class Null01 {
  public static void main(String[] args) {
    String string1;
    string1 = "なんばむった";
    System.out.println(string1 + "の文字数は," + string1.length());
    // なんばむったの文字数は,6
    string1 = "";
    System.out.println(string1 + "の文字数は," + string1.length());
    //  の文字数は,0
    string1 = null;
    System.out.println(string1 + "の文字数は," + string1.length());
    // error発生する。ぬるぽ〜
  }
}
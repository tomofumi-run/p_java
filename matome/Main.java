public class Main {
  public static void main(String[] args){
    String name = "ほげ丸ほげ郎";
    int age = 30;
    hello(name);
    ask(age);
    kind(lie(age));
  }

  public static void hello(String name){
    System.out.println(name + "さん、こんにちは。");
  }

  public static void ask(int age){
    System.out.println("ご年齢はおいくつですか？");
    System.out.println(age + "歳なんですか！");
  }

  public static int lie(int age){
    return age - 10;
  }
  public static void kind(int lie){
    System.out.println(lie + "歳かと思いました！w");
  }
}
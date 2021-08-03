public class Sushi {
  String[] netas = {"マグロ","カンパチ","イカ","タコ","エビ"};

  public void order_all(){
    System.out.println("いらっしゃいませ。当店のメニューはこちらです。");
    for(String neta : netas) {
      System.out.println(neta);
    }

  }

  public void order(){
    System.out.println("ご注文をどうぞ");
    String input = new java.util.Scanner(System.in).nextLine();
    System.out.println(input + "ですね。");
    }
}
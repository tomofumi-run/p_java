public class Main {
  public static void main(String[] args){
    System.out.println("数当てゲームVer1です。\n好きな数字を入れてみてください。");
    int n = new java.util.Scanner(System.in).nextInt();
    int ans = new java.util.Random().nextInt(n);
    System.out.println("あなたが入力した数字は" + ans + "ですか？");

    System.out.println("あなたのお名前を教えてください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("ご年齢を入力してください");
    int age = new java.util.Scanner(System.in).nextInt();

    System.out.println("お名前:" + name + "ご年齢:" + age);
  }
}
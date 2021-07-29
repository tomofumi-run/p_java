public class Engineer extends Human{
  // 任意の数字に3.14をかけ算するプログラム
  public void doCal(){
    System.out.println("計算は私に任せなさい！好きな数を入力してくれれば3.14を掛けます。");
    double input = new java.util.Scanner(System.in).nextInt();
    if(input < 0){
      System.out.println("正の数値を入力してください");
    }
    double result = input * 3.14;
    System.out.println("答えが出ました。ズバリ\n" + result + "ですね!!!!");
  }
}
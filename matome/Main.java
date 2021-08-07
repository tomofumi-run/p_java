public class Main {
  public static void main(String[] args){
    int tmp = 30;
    System.out.println("現在の室温は" + tmp + "です。");
    System.out.println("エアコンをつけますか？ Yes or No");
    String input = new java.util.scanner(system.in).nextline();
    if(input == "Yes"){
      System.out.println("エアコンを起動");
      while(tmp < 25){
        tmp--;
        System.out.println("室温が"+ tmp +"に下がりました。")
      }
      System.out.println("最適な温度に下がりました。エアコンを停止します。");
    } else if(input == "No") {
      System.out.println("まぁ、無理だけはするなよ。");
    } else {
      System.out.println("YesかNoかで指示してください。それ以外は受け付けられません。");
    }

  }
}
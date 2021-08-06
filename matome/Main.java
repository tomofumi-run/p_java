public class Main {
  public static void main(String[] args){
    boolean waitTime = true;
    int time = 60;
    if(waitTime == true){
      System.out.println("このアトラクションは待ち時間があります。");
      if(time > 30){
        System.out.println("30分以上待ちです。");
      } else {
        System.out.println("比較的スムーズにご利用できます。");
      }
    } else {
      System.out.println("このアトラクションは待ち時間なしでご利用できます。");
    }
  }
}
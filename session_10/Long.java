import java.util.Date;

public class Long {
  public static void main(String[] args){
    long start = System.currentTimeMillis(); //エポックから経過したミリ秒の時間を取得
    long end = System.currentTimeMillis(); // (end - start)で何秒掛かったかを計算できる。

    Date d = new Date(); // 現在の日時を取得
    System.out.println(d.getTime()); // long型(エポックから経過したミリ秒の時間)
    System.out.println(d);
  }
}
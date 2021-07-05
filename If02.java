public class If02 {
  public static void main(String[] args) {
    int num = 7;
    if (num < 5) {
      System.out.println(num + " は5未満です。");
    } else if (num < 10){
      System.out.println(num + " は10未満です。");
    } else if (num < 15) {
      System.out.println(num + " は15未満です。");
    } else {
      System.out.println(num + " は15未満でない数です。");
    }
  }
}
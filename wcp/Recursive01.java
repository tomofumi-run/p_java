public class Recursive01 {
  public static void main(String[] args) {
    int num = 1;
    printNum(num);
  }
  public static int printNum(int num) {
    if (num < 50) {
      num *= 2;
      System.out.println(num);
      printNum(num);
    }
    return num;
  }
}

public class DoWhile01 {
  public static void main(String[] args) {
    int num = 1;
    do {
      num *= 2;
      System.out.println(num);
    } while (num < 20); //numを2ずつ✖️する。50まで
  }
}

// whileは実行前評価, do~whileは実行後評価
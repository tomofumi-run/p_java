public class Exception02 {
  public static void main(String[] args) {
    try {
      // tryブロック:例外が発生する可能性がある処理を記述
      System.out.println("100 / 0 は？");
      // ここで例外が発生
      int result = 100 / 0;
      System.out.println("計算結果は" + result);
      // ArithmeticExceptionクラスの例外処理
    } catch (ArithmeticException e){
      System.out.println("例外が発生です。");
    } finally {
      // 例外が発生しても処理を実行する
      System.out.println("プログラム終了");
    }
  }
}


// 100 / 0 は？
// 例外が発生です。
// プログラム終了
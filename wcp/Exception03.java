public class Exception03 {
	public static void main(String[] args) {
		try {
			Exception03.division(100,0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException例外が発生");
      // キャッチした例外をインスタンスへスローする
			throw e;
		}
    // finalyではないので実行されない。
		System.out.println("プログラム終了");
	}
	public static void division(int a, int b) {
		System.out.println(a + "÷" + b + "は？");
		if (b == 0) {
      // 割り算で例外が発生するので、意図的に例外インスタンスを生成してスローする
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}

// 100÷0は？
// IllegalArgumentException例外が発生
// Exception in thread "main" java.lang.IllegalArgumentException: 引数が不正です
//         at Exception03.division(Exception03.java:16)
//         at Exception03.main(Exception03.java:4)
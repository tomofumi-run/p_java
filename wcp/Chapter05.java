public class Chapter05 {
  public static void main(String[] args) {
    // プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
    long l = 123456789L; //最後にLをつけて初期化
    double d = 0.123; //小数値で初期化
    boolean b = true; //trueで初期化

    System.out.println(l);
    System.out.println(d);
    System.out.println(b);

    // ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
    Integer i = 100; //intの値で初期化
    Float f = 1.234f; //fをつけて初期化
    Character c = 'え'; //''で初期化

    System.out.println(i);
    System.out.println(f);
    System.out.println(c);

    // 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
    int[] array = { 1,2,3,4,5 };
    System.out.println(array[3]);
  }
}
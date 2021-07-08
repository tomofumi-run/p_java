public class Chapter15_3 {
  public static void main(String[] args){
    int i1 = 123;
    double d1 = i1; //暗黙的にキャストされている
    System.out.println(d1); //123.0

    double d2 = 12.345;
    int i2 = (int) d2; //明示的にキャスト error解消 12
    System.out.println(i2); // double -> int error

    int i3 = 1;
    int i4 = 2;
    double d3 = (double) i3 / i4; //明示的にキャスト 期待通りの結果 0.5
    System.out.println(d3); //0.0

    int i5 = 128;
    byte b1 =(byte) i5; //明示的にキャスト 期待通りの結果 -128
    System.out.println(b1); //int -> byte error
  }
}

//データ型の小さい方から多い方へは暗黙的キャストが適用
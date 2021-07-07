public class Operator01 {
  public static void main(String[] args){
    int a = 15;
    int b;
    b = a * 3; //rubyでの演算子と同じ
    System.out.println(a); //15
    System.out.println(b); //45

    int c;
    c = 10;
    c ++;
    System.out.println(c); //11

    int d = 5;
    int e = --d;

    System.out.println(d); //4 --dしたので
    System.out.println(e); //4

    int f = 10;
    f /= 2;
    System.out.println(f); //5

    int g = 15;
    boolean h;
    h = g < 20; // 15 < 20 => true
    System.out.println(h);
    h = g > 20; // 15 > 20 => false
    System.out.println(h);

    boolean i = true;
    boolean j = false;
    boolean k;
    k = i && true;
    System.out.println(k); // true and true = true
    k = j || false;
    System.out.println(k); // false or false = false

    String l = "難波";
    String m = "六太";
    String n = l + m;
    System.out.println(n); //難波六太

    String o = "東京";
    String p = "東京";
    String r = "大阪";
    System.out.println(o == p); //true
    System.out.println(o == r); //false
  }
}
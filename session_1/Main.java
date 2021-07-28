public class Main {
  public static void main(String[] args){
    System.out.println("Hello World");
    System.out.println("Good Morning World");
    System.out.println("Good Evening World");

    long worldPeople; worldPeople = 6900000000L; // 8byte
    int salary; salary = 152000; // 4byte
    short age; age = 18; // 2byte
    byte glasses; glasses = 2; // 1byte


    // Practice

    int v = 3;
    int b = 5;
    int area = v * b ;

    System.out.println("縦幅" + v + "横幅" + b + "の長方形の面積は、" + area );

    boolean is_active = true;
    char CoolChar = '駆';
    float pi = 3.14F;
    double num = 3141592658L;
    String minato = "ミナトの攻撃！的に15ポイントのダメージを与えた。";
  }
}

// ソースコードは人が理解できるが、CPUは判断できない
// コンパイルすることで、CPUに理解できるように翻訳してあげる
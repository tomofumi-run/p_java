public class Main {
  public static void main(String[] args){
    introduceOneself();
    email("hoge@email.com", "起きてる？", "早起きは三文の徳");
    email("hoge@email.com", "昨日寝たの何時なんよw");
    double res = calcTriangleArea(10,20);
    System.out.println(res);
    double res = calcCircleArea(5);
    System.out.println(res);
  }
    public static void introduceOneself(){
      String name = "中川";
      int age = 27;
      double height = 168.5;
      char sex = '男';
      System.out.println("私の名前は" + name + "です。\n年齢は" + age + "身長は" + height + "\n性別は" + sex + "です。よろしくです。");
    }

    public static void email(String title, String address, String text) {
      System.out.println("「" + title + "」にメールを送信しました。\n件名:" + address + "\n本文:" + text );
    }

    public static void email(String title, String text){
      System.out.println("「" + title + "」にメールを送信しました。\n件名:無題\n本文:" + text );
    }

    public static double calcTriangleArea(double bottom, double height){
      double result = bottom * height / 2;
      return result;
    }
    public static double calcCircleArea(double radius){
      double result = radius * radius * 3.14;
      return result;
    }
}
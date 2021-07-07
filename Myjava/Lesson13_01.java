class Student {
  String name = "nakagawa";

  public void calculateAvg(int math, int english) {
    System.out.println((math + english)/2);
  }
}

public class Lesson13_01{
  public static void main(String[] args){
    Student a001 = new Student(); //インスタンス化 class -> 使える実態に変換
    a001.name = "sato";
    System.out.println(a001.name);
    a001.calculateAvg(90,80);

    Student a002 = new Student();
    a002.name = "yamada";
    System.out.println(a002.name);
    a002.calculateAvg(45,100);
  }
}
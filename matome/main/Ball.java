public class Ball{
  String name = "サッカーボール";
  int deadLine;

  void inflate(){
    this.deadLine = 500;
    System.out.println(this.name + "に空気を入れた。使用期限が伸びた。");
  }
}
public class Chapter07 {
  public static void main(String[] args) {
    int  dis = 10;
    if (dis < 5) {
      System.out.println("とても近いです");
    } else if (dis < 10){
      System.out.println("近いです");
    } else if (dis < 15) {
      System.out.println("遠いです");
    } else {
      System.out.println("とっても遠いです");
    }

   String color = "red";
   switch(color) {
    case "red":
      System.out.println("赤信号なう");
      break;
    case "yellow":
      System.out.println("黄信号なう");
      break;
    case "blue":
      System.out.println("青信号なう");
      break;
    default:
      System.out.println("信号の色はないようです。");
   }
  }
}
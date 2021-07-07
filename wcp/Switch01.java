public class Switch01 {
  public static void main(String[] args) {
    int val  = 2;
    switch (val) { //case式と同じ
      case 3:
          System.out.println("よくできました！");
          break; //breakで処理から抜け出す
      case 2:
          System.out.println("ふつうです！");
          break;
      default:
          System.out.println("もう少し頑張ろう！");
      }
    }
}
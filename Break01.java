public class Break01 {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      if (i == 2) {
        break; //2の時に抜け出す
      }
      System.out.println(i);
    }
  }
}

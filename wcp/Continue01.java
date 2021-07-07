public class Continue01 {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      if (i == 2) {
        continue; //2の時だけ抜け出す
      }
      System.out.println(i);
    }
  }
}

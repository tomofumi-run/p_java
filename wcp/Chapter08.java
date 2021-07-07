public class Chapter08 {
  public static void main(String[] args) {
    int num = 1;
    while (num < 5) {
      System.out.println(num * num);
      num++;
    }
    int ary[] = { 1,2,3,4 };
    for (int i = 0; i < ary.length; i++) {
      System.out.println(ary[i]);
    }

    for(int val : ary) {
      if(val % 2 == 0) {
        continue;
      }
        System.out.println(val);
    }
  }
}
public class Main {
  public static void main(String[] args){
    int [] scores = { 10, 20, 30, 40, 50 };
    int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    int avg = sum / scores.length;
    System.out.println(sum);
    System.out.println(avg);

    Practice

    int[] moneyList = { 121902, 8302, 55100 };
    for(int n: moneyList){
      System.out.println(n);
    }

    int[] numbers = { 3, 4, 9 };
    System.out.println("1桁の数を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for(int n:numbers){
      if(input == n){
        System.out.println("アタリ！");
      }
    }
  }
}
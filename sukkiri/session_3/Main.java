public class Main {
  public static void main(String[] args){
    System.out.println("1~4の数字を入力してください");
    int omikuji = new java.util.Scanner(System.in).nextInt();
    switch(omikuji) {
      case 1:
        System.out.println("凶");
        break;
      case 2:
        System.out.println("小吉");
        break;
      case 3:
        System.out.println("中吉");
        break;
      case 4:
        System.out.println("大吉");
        break;
      default :
        System.out.println("正しい数字を入力してください");
    }
    for(int i = 1; i < 10; i++){
      for(int j = 1; j < 10; j++){
        if( i == 2){
          continue;
        }
        System.out.print(i*j);
        System.out.print(" ");
      }
      System.out.println("");
    }
  // Practice
    int seibutu = 0;
    int age = 11;
    System.out.println("Hello");
    if(seibutu == 0){
      System.out.println("I am Man");
      System.out.println("Age:" + age);
    } else {
      System.out.println("I am Woman");
    }
    System.out.println("Let's Go");

    System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更 >");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch(selected){
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
      default:
    }

    System.out.println("数当てゲーム！");
    int ans = new java.util.Random().nextInt(10);
    for(int i = 0; i < 5; i++){
      System.out.println("0〜9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if(num == ans){
        System.out.println("あたり！");
        break;
      } else {
        System.out.println("はずれ");
      }
    }
    System.out.println("ゲームを終了します。");
  }
}
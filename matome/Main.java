public class Main {
  public static void main(String[] args){
    System.out.println("0から20まで2の倍数のみ答えます。");
    for(int i = 0; i < 21; i++){
      if(i % 2 == 0){
        System.out.println(i);
      }
    }
  }
}
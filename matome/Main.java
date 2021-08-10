public class Main {
  public static void main(String[] args){
    getAdd("はろー",2);
    getSub(2,2);
    getMul(2,2);
    getDiv(2,2);
  }

  public static void getAdd(int x, int y){
    System.out.println(x + y);
  }
  public static void getSub(int x, int y){
    System.out.println(x - y);
  }
  public static void getMul(int x, int y){
    System.out.println(x * y);
  }
  public static void getDiv(int x, int y){
    System.out.println(x / y);
  }
}
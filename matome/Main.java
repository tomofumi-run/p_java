public class Main {
  public static void main(String[] args){
    System.out.println("好きなポケモンを選びなさい。");
    int pokemon = 6;

    switch (pokemon) {
      case 1:
        System.out.println("ピカチュウに決めた！");
        break;
      case 2:
        System.out.println("ヒトカゲに決めた！");
        break;
      case 3:
        System.out.println("ゼニガメに決めた！");
        break;
      case 4:
        System.out.println("フシギダネに決めた！");
        break;
      default:
        System.out.println("オーキドに決めた！");
    }
  }
}
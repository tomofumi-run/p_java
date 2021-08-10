package matome.main;
import matome.vegetable.Yasai;
import matome.beef.Beef;
import matome.cut.Cut;
public class Cook {
  public static void main(String[] args){
    Yasai.carrot();
    Yasai.potato();
    Beef.prep();
    Cut.serve();
    System.out.println("後はルーと一緒に煮込むだけ！");
  }
}
package session_6.calcapp.main; // ディレクトリ構造に依存する p_javaからのコンパイル
import session_6.calcapp.logics.*; // どこのクラスを呼び出すか明示してあげる * ワイルドカードも使用可能
public class Calc {
  public static void main(String[] args){
    int a = 1;
    int b = 5;
    // int total = session_6.calcapp.logics.CalcLogic.tasu(a,b); Fully Qualified Class Name(FQCN)＝完全限定クラス名の記述量が長くなるので面倒臭い
    // int delta = session_6.calcapp.logics.CalcLogic.hiku(a,b); これを解決してくれるimport
    int total = CalcLogic.tasu(a,b);
    int delta = CalcLogic.hiku(a,b);
    System.out.println("足すと" + total + "\n引くと" + delta);
  }
}
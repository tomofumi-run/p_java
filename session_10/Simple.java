import java.text.SimpleDateFormat;
import java.util.Date;

// String型で見やすく整理
public class Simple {
  public static void main(String[] args) throws Exception{
    Date now = new Date();
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String s = f.format(now); // フォーマットとしてString化
    System.out.println(s);

    Date d = f.parse("2011/09/22 01:23:45"); // 文字列化
    System.out.println(d);
  }
}
import java.util.Calendar;
import java.util.Date;

// int型で見やすく整理
public class Cal {
  public static void main(String[] args){
    Date now = new Date(); // 現在時刻
    Calendar c = Calendar.getInstance(); // カレンダー Y/M/D 人が認識できないデータ
    c.setTime(now); // cにnowの時間を代入
    Date n = c.getTime();
    System.out.println(n); // 現在時刻
    int y = c.get(Calendar.YEAR); // Yearのデータを抽出
    System.out.println("今年は" + y + "年です！");

    c.set(2010,8,22,1,23,45); // 時間を代入
    c.set(Calendar.YEAR, 2011); // 2011年に変更
    Date past = c.getTime(); // 時間を取得して代入
    System.out.println(past);
  }
}
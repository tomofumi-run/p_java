public class Human03 {
  public String name;
  public int age;
  public String profession;

  public Human03(){
    this.name = "中川";
    this.age = 28;
    this.profession = "教員";
  }

  public String getProfile(){
    return "年齢は" + this.age + "で、職業は" + this.profession + "です。";
  }

  public void greet(String friend) {
    if(friend == null) {
      System.out.println("挨拶する友達がいません...。");
      return;
    }
    System.out.println(friend + "さん、こんにちは。");
  }
}
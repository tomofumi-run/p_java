public class Human {
  private String name;
  private int age;
  private char sex;
// nameメソッド
  public String getName(){
    System.out.println("私の名前は..." + this.name);
    return this.name;
  }
  public void setName(String name){
    System.out.println("名前変更を行いました！");
    this.name = name;
  }
  // ageメソッド
  public int getAge(){
    System.out.println("私の年齢は..." + this.age);
    return this.age;
  }
  public void setAge(int age){
    this.age = age;
  }
// sexメソッド
  public char getSex(){
    System.out.println("私の性別は..." + this.sex);
    return this.sex;
  }
  public void setSex(char sex){
    this.sex = sex;
  }
// GoodByeメソッド
  public void goodBye(){
    System.out.println("GoodBye!!!!");
  }
// コンストラクタ
  public Human(){
    this.name = "赤ちゃん";
    this.age = 0;
    this.sex = '?';
  }
}
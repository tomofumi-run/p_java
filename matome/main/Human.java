public class Human {
  // String name = "赤ちゃん";
  // int age = 0;
  private String name = "赤ちゃん";
  private int age = 0;
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge(){
    return this.age;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void call(){
    System.out.println("現在の年齢は、" + this.age + "です。");
  }
}
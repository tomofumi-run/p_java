public class ClassMethod01 {
  public static void main(String[] args) {
    Human01 yamada = new Human01(); //引数なしなので、山田召喚
    System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

    Human01 sato = new Human01("佐藤", 25); //引数にある佐藤召喚
    System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
  }
}
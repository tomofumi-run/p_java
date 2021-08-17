public class Teacher extends Human implements Sloth{

  public Teacher(String name, int money){
    setName(name);
    setMoney(money);
  }

  public void teach(){
    System.out.println("優しく教えます。");
  }

  public void call(){
    System.out.println(getName() + "です。\nお給料は" + getMoney() + "です。");
  }

  public void run(){
    System.out.println("休み時間は子どもたちと鬼ごっこ");
  }
  public void eat(){
    System.out.println("お昼ご飯はカレー");
  }
  public void sleep(){
    System.out.println("5時間目眠すぎ。");
  }

  public void tired(){
    System.out.println("もう18：00か！");
  }
}
public class Hero {
	String name = "ミナト";
	int hp = 100;

  public void setHp(int hp){
    this.hp = hp;
  }
  public int getHp(){
    return this.hp;
  }

	public Hero() {
	}

	public final void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は転んだ!");
		System.out.println("5のダメージ");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

	public void attack(Matango m){
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた!");
	}

}
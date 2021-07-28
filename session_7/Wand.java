public class Wand {
  private String name;
  private double power;

  public String getName(){
    return this.name;
  }
  public String getPower(){
    return this.power;
  }
  public void setName(String name){
    if(name == null || name.length() < 3){
      throw new IllegalArgumentException
      ("杖に設定されようとしている名前に異常があります。");
    }
    this.name = name;
  }
  public void setPower(double power){
    if(power <= 0.5 || power > 100.0){
      throw new IllegalArgumentException
      ("杖の増幅率に異常があります。");
    }
    this.power = power;
  }
}
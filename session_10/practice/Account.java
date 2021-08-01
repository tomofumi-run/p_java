public class Account {
  String num;
  int money;

  public Account(String num, int money){
    this.num = num;
    this.money = money;
  }

  public String toString(){
    String message = "¥"+ this.money + "(口座番号 = " + this.num + ")";
    return message;
  }

  public boolean equals(Object o) {
    if(this == o) {
      return true;
    }
    if(o instanceof Account){
      Account a = (Account) o;
      String nm1 = this.num.trim();
      String nm2 = a.num.trim();
      if(nm1.equals(nm2)){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args){
    Account a = new Account("4649",1592);
    System.out.println(a);
  }
}
package extend.human;
public class Employee{
  private String department;

  public Employee(String name, int age, String department){
    super(name, age);
    this.department = department;
  }

  public String getEmployeeProfile(){
    String profile = "年れは" + this.age + "です。";
    profile += "サラリーマンで、部署は" + this.department + "です。";
    return profile;
  }
}
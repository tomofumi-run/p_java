public class Main {
  public static void main(String[] args){
    Y[] numbers = new Y[2];
    numbers[0] = new A();
    numbers[1] = new B();

    for(Y n : numbers){
      n.b();
    }
  }
}
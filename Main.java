

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

interface FibonacciInterface {
  abstract public int calculateSpecific(int n);
  abstract public void printMany(int amount);
  abstract public String calculateMany(int amount);
}

class FibonacciImpl implements FibonacciInterface {
  @Override
  public int calculateSpecific(int n){
    return n;
  }
  
  @Override
  public void printMany(int amount){
    for (int i = 0; i < amount; i++){
      System.out.println(calculateSpecific(i));
    }
  }
  
  @Override
  public String calculateMany(int amount){
    return new String();
  }
}

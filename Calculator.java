// Below is the code needed in Java to make a simple calculator.
// Note: the main() method is called within the Calculator.java file.

public class Calculator{
  public Calculator() {
      // Constructor
    }

public int add(int a, int b){
  return a + b;
  }

public int subtract(int a, int b){
  return a - b;
}

public int multiply(int a, int b){
  return a * b;
}

public int divide(int a, int b){
  return a / b;
}

public int modulo(int a, int b){
  return a % b;
}

public static void main(String[] args) {
  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.subtract(45,11));
  }
}

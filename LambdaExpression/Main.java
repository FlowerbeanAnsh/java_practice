package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        //1- by anonymous class

        // by anonymous class we can do the operations on one or more methods
        // but in lambda expression we can do the operation only on a single method
        // lambda and functional interface launched in java 1.8

      FuncInterface i = new FuncInterface() {
          @Override
          public void method1() {
              System.out.println("Hello");
          }
      };
      i.method1();
      FuncInterface i1 = new FuncInterface() {
          @Override
          public void method1() {
              System.out.println("Hello1");
          }
      };

      i1.method1();

    }
}

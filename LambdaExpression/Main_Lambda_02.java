package LambdaExpression;

public class Main_Lambda_02 {
    public static void main(String[] args) {

        Runnable thread = () ->
        {
            for (int i = 1; i <=10; i++) {
                System.out.println(i);
            }
        };

        Thread thread1 = new Thread(thread);
        thread1.start();

    }
// Runnable, callable and comparable are also pre-defined
    // functional interfaces
}

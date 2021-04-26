public class FibonacciRecursion {
    static int a=0,b=1,c;
    public static void main(String[] args) {
        System.out.print(a + " "+b);
        FibonacciRecursion obj = new FibonacciRecursion();
        obj.printFibonacci(5);

    }
    public int printFibonacci(int n){
        if(n>=1) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            printFibonacci(n - 1);
        }
        return c;
    }

}

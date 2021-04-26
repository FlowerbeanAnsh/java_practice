public class FactorialRecursion {
    static int fact=1;

    public static void main(String[] args) {
        FactorialRecursion obj = new FactorialRecursion();
        System.out.println(obj.Factorial(5));
    }
    public int Factorial(int n) {
        if (n >= 1) {

            fact = fact * n;

            Factorial(n - 1);
        }
        return fact;
    }
}

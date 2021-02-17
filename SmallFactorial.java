import java.util.Scanner;

public class SmallFactorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int i = 0; i < t; i++) {
            int fact =1 ;
            int number = kb.nextInt();
            for (int i1 = 2; i1 <= number; i1++) {
                fact = fact * i1;
            }
            System.out.println(fact);
        }
    }
}
